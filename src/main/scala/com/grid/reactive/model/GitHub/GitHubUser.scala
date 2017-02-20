package com.grid.reactive.model.GitHub

/**
  * Created by alexandru-petrisorpajarcu on 19/02/2017.
  */
case class GitHubUser(
  login: String,
  id: Long,
  avatar_url: String,
  gravatar_id: String,
  url: String,
  html_url: String,
  followers_url: String,
  following_url: String,
  gists_url: String,
  starred_url: String,
  subscriptions_url: String,
  organizations_url: String,
  repos_url: String,
  events_url: String,
  received_events_url: String,
  `type`: String,
  site_admin: Boolean
)

