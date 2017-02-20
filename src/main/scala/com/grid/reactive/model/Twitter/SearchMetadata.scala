package com.grid.reactive.model.Twitter

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class SearchMetadata(
  completed_id: Option[Int],
  max_id: Long,
  max_id_str: String,
  query: String,
  refresh_url: String,
  count: Long,
  since_id: Long,
  since_id_str: String
)