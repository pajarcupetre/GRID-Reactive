package com.grid.reactive.model.Twitter

/**
  * Created by alexandru-petrisorpajarcu on 19/02/2017.
  */
case class TwitterPost(
                        created_at: String,
                        id: Long,
                        id_str: String,
                        text: String,
                        truncated: Boolean,
                        entities: TweetEntities,
                        metadata: TwitterMetadata,
                        source: String,
                        in_reply_to_status_id: Option[Long],
                        in_reply_to_status_id_str: Option[String],
                        in_reply_to_user_id: Option[Long],
                        in_reply_to_user_id_str: Option[String],
                        in_reply_to_screen_name: Option[String],
                        user: TwitterUser,
                        geo: Option[String],
                        coordinates: Option[TwitterCoordinates],
                        place: Option[TwitterPlace],
                        contributors: Option[Seq[TwitterUser]],
                        retweeted_status: Option[TwitterPost],
                        is_quote_status: Boolean,
                        retweet_count: Int,
                        favorite_count: Option[Int],
                        favorited: Option[Boolean],
                        retweeted: Boolean,
                        possibly_sensitive: Option[Boolean],
                        lang: Option[String]
                      )