package com.grid.reactive

import com.grid.reactive.search.ProjectOnTwitter
import play.api.libs.json.Json
import com.grid.reactive.protocols.ResponseProtocols._

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object Main extends App{
  val response = ProjectOnTwitter.getTweetsForProjects
  val jsonResponse = Json.toJson(response)
  print(Json.prettyPrint(jsonResponse))

}
