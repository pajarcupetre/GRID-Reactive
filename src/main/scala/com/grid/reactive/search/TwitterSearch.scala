package com.grid.reactive.search

import com.grid.reactive.AuthTokenException
import com.grid.reactive.config.ConfigManager
import com.grid.reactive.model.Twitter.{TwitterAuthToken, TwitterPost, TwitterPostSimplified, TwitterResponse}
import com.grid.reactive.protocols.ResponseProtocols._
import play.api.libs.json.Json
import skinny.http.{HTTP, Request}

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
trait TwitterSearch {

  def getUrl(tweet: TwitterPost) = {
    if (tweet.entities.urls.size > 0) {
      tweet.entities.urls(0).url
    } else {
      ""
    }
  }

  def getSimplifiedViewForListOfTweets(tweets: Seq[TwitterPost]): Seq[TwitterPostSimplified] = {
    if (tweets.size > 0) {
      tweets.map(tweet => TwitterPostSimplified(tweet.text, tweet.user.name, getRetweetedStatus(tweet), getUrl(tweet)))
    }
    else
    {
      Seq.empty[TwitterPostSimplified]
    }
  }

  def getRetweetedStatus(twitterPost: TwitterPost): Seq[String] = {
    twitterPost.retweeted_status match {
      case Some(tweet) =>  Seq(tweet.user.name) ++ getRetweetedStatus(tweet)
      case None => Seq.empty[String]
    }
  }

  def searchGithubProject(projectToSearch: String, authorizationHeader: String) : Seq[TwitterPost] = {

    val response = HTTP.get(Request(ConfigManager.getSearchUrlTwitter).queryParams("q" -> projectToSearch).
        header("Authorization", authorizationHeader))

    val responseParsed = Json.parse(response.body).as[TwitterResponse]
    responseParsed.statuses

  }

  def getAuthenticationToken = {
    val bearer = generateAuthenticationBearerToken
    val authHeader = "Basic " + bearer
    val response = HTTP.post(Request(ConfigManager.getAuthUrlTwitter).header("Authorization", authHeader)
        .body(ConfigManager.getAuthBodyTwitter.getBytes, ConfigManager.getAuthContentTypeTwitter))

    val responseParsed = Json.parse(response.body).as[TwitterAuthToken]
    if ("bearer".equals(responseParsed.token_type)) {
      responseParsed.access_token
    } else {
      throw new AuthTokenException("Bad token type")
    }
  }

  def generateAuthenticationBearerToken = {
    val key = ConfigManager.getTwitterKey + ":" + ConfigManager.getTwitterSecret
    new String(java.util.Base64.getUrlEncoder.encode(key.getBytes))
  }

  def getAuthorizationHeader = {
    val authToken = getAuthenticationToken
    "Bearer " + authToken
  }

}

object TwitterSearch extends TwitterSearch
