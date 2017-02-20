package com.grid.reactive.protocols

import com.grid.reactive.model._
import ai.x.play.json.Jsonx
import com.grid.reactive.model.GitHub.{GitHubProject, GitHubResponse, GitHubUser}
import com.grid.reactive.model.Twitter._
import play.api.libs.json.Format

/**
  * Created by alexandru-petrisorpajarcu on 19/02/2017.
  */
object ResponseProtocols {
  implicit val gitHubUserFormat: Format[GitHubUser] = Jsonx.formatCaseClass[GitHubUser]
  implicit val gitHubProjectFormat: Format[GitHubProject] = Jsonx.formatCaseClass[GitHubProject]
  implicit val gitHubResponseFormat: Format[GitHubResponse] = Jsonx.formatCaseClass[GitHubResponse]
  implicit val twitterUserMentionsTypeFormat: Format[TwitterUserMentionsType] = Jsonx.formatCaseClass[TwitterUserMentionsType]
  implicit val twitterAuthTokenFormat: Format[TwitterAuthToken] = Jsonx.formatCaseClass[TwitterAuthToken]
  implicit val twitterUrlEntityFormat: Format[TwitterUrlEntity] = Jsonx.formatCaseClass[TwitterUrlEntity]
  implicit val twitterUrlsObjectFormat: Format[TwitterURLsObject] = Jsonx.formatCaseClass[TwitterURLsObject]
  implicit val twitterUserEntitiesFormat: Format[TwitterUserEntities] = Jsonx.formatCaseClass[TwitterUserEntities]
  implicit val twitterUserFormat: Format[TwitterUser] = Jsonx.formatCaseClass[TwitterUser]
  implicit val twitterMetadataFormat: Format[TwitterMetadata] = Jsonx.formatCaseClass[TwitterMetadata]
  implicit val tweetEntitiesFormat: Format[TweetEntities] = Jsonx.formatCaseClass[TweetEntities]
  implicit val twitterBoundingBoxFormat: Format[TwitterBoundingBox] = Jsonx.formatCaseClass[TwitterBoundingBox]
  implicit val twitterCoordinatesFormat: Format[TwitterCoordinates] = Jsonx.formatCaseClass[TwitterCoordinates]
  implicit val twitterPlaceFormat: Format[TwitterPlace] = Jsonx.formatCaseClass[TwitterPlace]
  implicit val twitterPostFormat: Format[TwitterPost] = Jsonx.formatCaseClass[TwitterPost]
  implicit val searchMetadataFormat: Format[SearchMetadata] = Jsonx.formatCaseClass[SearchMetadata]
  implicit val twitterResponseFormat: Format[TwitterResponse] = Jsonx.formatCaseClass[TwitterResponse]
  implicit val twitterPostSimplifiedFormat: Format[TwitterPostSimplified] = Jsonx.formatCaseClass[TwitterPostSimplified]
  implicit val gitHubProjectOnTwitterFormat: Format[GitHubProjectOnTwitter] = Jsonx.formatCaseClass[GitHubProjectOnTwitter]
}
