package com.grid.reactive

import com.grid.reactive.model.Twitter.TwitterPost
import com.grid.reactive.protocols.ResponseProtocols._
import com.grid.reactive.search.TwitterSearch
import play.api.libs.json.Json

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object TwitterSearchRunner extends App{

  val response: Seq[TwitterPost] = TwitterSearch.searchGithubProject("github.com/apache/spark",
    TwitterSearch.getAuthorizationHeader)
  val responseString = Json.prettyPrint(Json.toJson(response))
  print(responseString)
}
