package com.ebook.library

import java.io.File
import java.nio.file.{Files, Paths}

object InputReader {
  def getListOfSubDirectories(directoryName: String): Array[String] = {
    (new File(directoryName)).listFiles.filter(_.isDirectory).map(_.getName)
  }

  def getListOfFiles(directoryName: String): Array[String] = {
    (new File(directoryName)).listFiles.filter(_.isFile).map(_.getName)
  }

  def getAllFiles(directoryName: String) : Option[Array[Any]] = {
    val files = Set("")
    Files.exists(Paths.get(directoryName)) match {
      case true => Some(traverseFileStructure(directoryName, files))
      case _ => None
    }
  }

  private def traverseFileStructure(directoryName: String, files: Set[String]) = {
    (new File(directoryName)).listFiles.map(item => {
      if (item.isFile) {
        files + item.getName
        println(item.getName)
        files
      } else if (item.isDirectory) {
        getAllFiles(item.getAbsolutePath)
      }
    }
    )
  }
}