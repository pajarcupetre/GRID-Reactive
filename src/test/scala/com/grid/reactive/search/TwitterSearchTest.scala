package com.grid.reactive.search


import com.grid.reactive.model.Twitter.TwitterPost
import org.scalatest.FunSuite
import play.api.libs.json.Json
import com.grid.reactive.protocols.ResponseProtocols._

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
class TwitterSearchTest extends FunSuite{

  test("select at least one tweet for spark") {
    val authorizationHeader = TwitterSearch.getAuthorizationHeader
    val projects = TwitterSearch.searchGithubProject("github.com/apache/spark", authorizationHeader)
    assert(projects.size > 1)
  }

  test("load generated jsons and apply symplify") {
    val stream = getClass.getResourceAsStream("/twitterJsons.json")
    val json = try {  Json.parse(stream) } finally { stream.close() }
    val projects = TwitterSearch.getSimplifiedViewForListOfTweets(json.as[Seq[TwitterPost]])
    assert(projects.size == 12)
    assert("alejandro vergara".equals(projects.head.user))
    assert("https://t.co/LFtM9fsQjq".equals(projects.head.url_shared))
    assert(projects.head.text.equals(projects(1).text))
  }

  test("Url get method is taking the right url") {
    val stream = getClass.getResourceAsStream("/twitterJsons.json")
    val json = try {  Json.parse(stream) } finally { stream.close() }
    val response = json.as[Seq[TwitterPost]]
    val tweet = response.head
    assert("https://t.co/LFtM9fsQjq".equals(TwitterSearch.getUrl(tweet)))
  }
}
