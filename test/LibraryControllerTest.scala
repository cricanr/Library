package com.ebook.library.controllers

import org.scalatestplus.play.{PlaySpec}
import play.api.http.{HttpProtocol, Status, HeaderNames}
import play.api.test._
import org.scalatestplus.play.OneAppPerTest

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
  with FutureAwaits

class LibraryControllerTest  extends PlaySpecWrapper with OneAppPerTest  {

  "GET ebook library should" in {
    val Some(response) = route(FakeRequest(GET, "/ebook-library/books"))
    status(response) mustEqual OK
    contentAsString(response) must be("""{welcome to ebook library!}""")
  }

}
