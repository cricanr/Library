package com.ebook.library.InputReaderTest

import com.ebook.library.InputReader
import com.ebook.library.testutils.PlaySpecWrapper

class InputReaderTest extends PlaySpecWrapper {

  "should return empty list when path is invalid / non-existing" in {
    val path = "./kittyCat"
    val files = InputReader.getAllFiles(path)

    files must be(None)
  }

  //TODO: add implementation
//  "should parse file system starting with path" in {
//    val path = "./"
//    val files = InputReader.getAllFiles(path)
//    println(files.toString)
//
//
//    files must contain ("application.conf")
//
//  }
}
