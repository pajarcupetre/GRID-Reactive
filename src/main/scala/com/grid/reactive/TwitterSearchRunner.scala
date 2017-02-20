package com.grid.reactive

import com.grid.reactive.model.Twitter.TwitterPost
import com.grid.reactive.search.TwitterSearch
import com.grid.reactive.protocols.ResponseProtocols._
import play.api.libs.json.Json

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object TwitterSearchRunner extends App{

  val response: Seq[TwitterPost] = TwitterSearch.searchGithubProject("github.com/apache/spark",
    TwitterSearch.getAuthorizationHeader)
  val simple_response = TwitterSearch.getSimplifiedViewForListOfTweets(response)
  val simple_response_json = Json.toJson(simple_response)

}
