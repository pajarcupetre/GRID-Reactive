package com.grid.reactive.model.Twitter

import play.api.libs.json.JsValue

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class TweetEntities(
                          hashtags: Option[Seq[JsValue]],
                          symbols: Option[Seq[String]],
                          user_mentions: Seq[TwitterUserMentionsType],
                          urls: Seq[TwitterUrlEntity]
)
