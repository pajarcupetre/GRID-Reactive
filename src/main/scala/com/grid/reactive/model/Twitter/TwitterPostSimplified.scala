package com.grid.reactive.model.Twitter

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class TwitterPostSimplified(text: String, user: String, retweeted_from: Seq[String], url_shared: String)
