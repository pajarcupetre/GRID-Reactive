package com.grid.reactive.search

import com.grid.reactive.config.ConfigManager
import com.grid.reactive.model.GitHub.{GitHubProject, GitHubResponse}
import play.api.libs.json.Json
import skinny.http.{HTTP, Request}
import com.grid.reactive.protocols.ResponseProtocols._

trait GitHubSearch {

  def getListOfProject(query: String): Seq[GitHubProject] = {

    val url = ConfigManager.getGitHubUrl
    val response = HTTP.get(Request(url).queryParams("q" -> ConfigManager.getQuery))

    val responseParsed = Json.parse(response.body).as[GitHubResponse]
    responseParsed.items
  }

}

object GitHubSearch extends GitHubSearch
