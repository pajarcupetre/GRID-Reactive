package com.grid.reactive.model.Twitter

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class TwitterUserMentionsType(
  screen_name: String,
  name: String,
  id: Long,
  id_str: String,
  indices: Seq[Long]
)
