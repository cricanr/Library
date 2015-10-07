package com.ebook.library.InputReader

import java.io.File

object InputReader {
  def getListOfSubDirectories(directoryName: String): Array[String] = {
    (new File(directoryName)).listFiles.filter(_.isDirectory).map(_.getName)
  }

  def getListOfFiles(directoryName: String): Array[String] = {
    (new File(directoryName)).listFiles.filter(_.isFile).map(_.getName)
  }

  def getAllFiles(directoryName: String): Array[Any] = {
    (new File(directoryName)).
      listFiles.
      map(item => {
      if (item.isFile) {
        println(item.getName)
      } else if (item.isDirectory) {
        getAllFiles(item.getAbsolutePath)
      }
    }
      )
  }
}
