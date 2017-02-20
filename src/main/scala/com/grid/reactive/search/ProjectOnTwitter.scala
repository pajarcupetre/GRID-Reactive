package com.grid.reactive.search

import com.grid.reactive.config.ConfigManager
import com.grid.reactive.model.GitHub.GitHubProject
import com.grid.reactive.model.GitHubProjectOnTwitter

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
trait ProjectOnTwitter {

  def getTweetsForProject(project: GitHubProject, authorizationHeader: String) = {
    val key = project.html_url.replaceFirst("https://","")
    val tweets = TwitterSearch.searchGithubProject(key, authorizationHeader)
    val simplifiedTweets = TwitterSearch.getSimplifiedViewForListOfTweets(tweets)
    GitHubProjectOnTwitter(project.name, project.html_url, simplifiedTweets)
  }

  def getTweetsForProjects = {
    val keyToSearchOnGithub = ConfigManager.getQuery
    val gitProjects = GitHubSearch.getListOfProject(keyToSearchOnGithub)
    val limitedGitProjects = gitProjects.take(ConfigManager.getProjectLimit.toInt)
    val authorizationHeader = TwitterSearch.getAuthorizationHeader
    limitedGitProjects.map(project => getTweetsForProject(project, authorizationHeader))
  }

}

object ProjectOnTwitter extends ProjectOnTwitter
