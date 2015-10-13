package com.ebook.library.integration

import com.ebook.library.testutils.PlaySpecWrapper
import org.scalatestplus.play.OneAppPerTest
import play.api.test._

class LibraryControllerTest  extends PlaySpecWrapper with OneAppPerTest  {

  "GET ebook library should respond with a welcome message" in {
    val Some(response) = route(FakeRequest(GET, "/ebook-library/books"))
    status(response) mustEqual OK
    contentAsString(response) must be("""{welcome to ebook library!}""")
  }

}
