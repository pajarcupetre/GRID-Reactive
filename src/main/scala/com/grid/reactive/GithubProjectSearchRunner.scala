package com.grid.reactive

import com.grid.reactive.config.ConfigManager
import com.grid.reactive.search.GitHubSearch
import com.grid.reactive.protocols.ResponseProtocols._
import play.api.libs.json.Json

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object GithubProjectSearchRunner extends App {

  val projects = GitHubSearch.getListOfProject(ConfigManager.getQuery)
  val responseString = Json.prettyPrint(Json.toJson(projects))
  print(responseString)

}
