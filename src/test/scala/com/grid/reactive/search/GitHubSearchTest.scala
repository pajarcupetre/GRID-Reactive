package com.grid.reactive.search

import com.grid.reactive.config.ConfigManager
import org.scalatest.FunSuite

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
class GitHubSearchTest extends FunSuite  {

  test("select only one project with BigProjectNameToBeChangedByME name") {
    val projects = GitHubSearch.getListOfProject(ConfigManager.getQuery)
    assert(projects.size == 1)

    val project = projects.head
    assert("pajarcupetre".equals(project.owner.login))
  }


}
