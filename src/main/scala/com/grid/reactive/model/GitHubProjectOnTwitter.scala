package com.grid.reactive.model

import com.grid.reactive.model.Twitter.TwitterPostSimplified

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class GitHubProjectOnTwitter(project_name: String, url: String, twitterLinks: Seq[TwitterPostSimplified])
