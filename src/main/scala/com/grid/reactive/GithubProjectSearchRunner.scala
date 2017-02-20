package com.grid.reactive

import com.grid.reactive.config.ConfigManager
import com.grid.reactive.search.GitHubSearch

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object GithubProjectSearchRunner extends App {

  val projects = GitHubSearch.getListOfProject(ConfigManager.getQuery)

}
