package com.grid.reactive.model.Twitter

import play.api.libs.json.JsValue

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
case class TwitterUser(
  id: Long,
  id_str: String,
  name: String,
  screen_name: String,
  location: Option[String],
  description: Option[String],
  url: Option[String],
  entities: TwitterUserEntities,
  `protected`: Boolean,
  followers_count: Long,
  friends_count: Long,
  listed_count: Long,
  created_at: String,
  favourites_count: Long,
  utc_offset: Option[Long],
  time_zone: Option[String],
  geo_enabled: Boolean,
  verified: Boolean,
  statuses_count: Long,
  lang: String,
  contributors_enabled: Boolean,
  is_translator: Boolean,
  is_translation_enabled: Boolean,
  profile_background_color: String,
  profile_background_image_url: JsValue,
  profile_background_image_url_https: JsValue,
  profile_background_tile: Boolean,
  profile_image_url: String,
  profile_image_url_https: String,
  profile_link_color: String,
  profile_sidebar_border_color: String,
  profile_sidebar_fill_color: String,
  profile_text_color: String,
  profile_use_background_image: Boolean,
  has_extended_profile: Boolean,
  default_profile: Boolean,
  default_profile_image: Boolean,
  following: Option[Boolean],
  follow_request_sent: Option[Boolean],
  notifications: Option[Boolean],
  translator_type: String
)