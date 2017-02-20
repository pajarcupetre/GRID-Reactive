package com.grid.reactive.model.GitHub

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class GitHubResponse(total_count: Long, incomplete_results: Boolean, items: Seq[GitHubProject])
