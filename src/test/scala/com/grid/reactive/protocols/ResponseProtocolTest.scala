package com.grid.reactive.protocols

import com.grid.reactive.model.GitHub.GitHubProject
import com.grid.reactive.model.Twitter.TwitterPost
import com.grid.reactive.protocols.ResponseProtocols._
import org.scalatest.FunSuite
import play.api.libs.json.Json

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
class ResponseProtocolTest extends FunSuite {

  test("loading one json file for twitter will be procesed ok") {
    val stream = getClass.getResourceAsStream("/twitterJsons.json")
    val json = try {
      Json.parse(stream)
    } finally {
      stream.close()
    }
    val projects = json.as[Seq[TwitterPost]]
    val project = projects.tail.head
    // second project should have empty on contributors and coordinates
    assert(project.contributors.isEmpty)
    assert(project.coordinates.isEmpty)
    assert("Tripp Braden".equals(project.user.name))
  }

  test("loading one json file for github will be procesed ok") {
    val stream = getClass.getResourceAsStream("/githubRepo.json")
    val json = try {
      Json.parse(stream)
    } finally {
      stream.close()
    }
    val project = json.as[GitHubProject]
    // second project should have empty on contributors and coordinates
    assert("dengcqw".equals(project.owner.login))
    assert(project.forks_count == 0)
    assert(project.has_downloads)
    assert(!project.fork)
  }
}
