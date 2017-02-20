package com.grid.reactive.config

import com.typesafe.config.ConfigFactory
import com.typesafe.config.Config;

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
object ConfigManager {

  val conf = ConfigFactory.load()
  val twitterConf = ConfigFactory.load("twitter_setup.conf")

  def getGitHubUrl = {
    conf.getString("github.url")
  }

  def getProjectLimit = {
    conf.getString("github.limit")
  }

  def getQuery = {
    conf.getString("github.query")
  }

  def getTwitterKey = {
    twitterConf.getString("twitter.api_key")
  }

  def getTwitterSecret = {
    twitterConf.getString("twitter.secret_key")
  }

  def getAuthUrlTwitter = {
    conf.getString("twitter.auth_url")
  }

  def getAuthContentTypeTwitter = {
    conf.getString("twitter.content_type")
  }

  def getAuthBodyTwitter = {
    conf.getString("twitter.auth_body")
  }

  def getSearchUrlTwitter = {
    conf.getString("twitter.search_url")
  }
}
