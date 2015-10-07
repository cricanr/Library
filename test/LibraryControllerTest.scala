package com.ebook.library.controllers

import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play.{PlaySpec, OneAppPerTest}
import play.api.http.{HttpProtocol, Status, HeaderNames}
import play.api.test._
import scala.concurrent.Future

import org.scalatestplus.play.OneAppPerTest

import scala.concurrent.Future

class PlaySpecWrapper
  extends PlaySpec
  with PlayRunners
  with HeaderNames
  with Status
  with HttpProtocol
  with DefaultAwaitTimeout
  with ResultExtractors
  with Writeables
  with EssentialActionCaller
  with RouteInvokers
//  with FutureAwaits

class LibraryControllerTest  extends PlaySpecWrapper with OneAppPerTest  {

  "GET ebook library should" in {
    val Some(response) = route(FakeRequest(GET, "/ebook-library/books"))
    status(response) mustEqual OK
    response.toString must be("""{welcome to ebook library!}""")
  }
  }
