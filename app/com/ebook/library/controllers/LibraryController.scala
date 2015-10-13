package com.ebook.library.controllers

import play.api.mvc._

class LibraryController extends Controller {

  def books = Action {
    Ok("""{welcome to ebook library!}""")
  }

}
