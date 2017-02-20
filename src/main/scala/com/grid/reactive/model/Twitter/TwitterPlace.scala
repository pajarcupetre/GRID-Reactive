package com.grid.reactive.model.Twitter

import play.api.libs.json.JsValue

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class TwitterPlace(
  attributes: Map[String, JsValue],
  bounding_box: TwitterBoundingBox,
  country: String,
  country_code: String,
  full_name: String,
  id: String,
  name: String,
  place_type: String,
  url: String
)