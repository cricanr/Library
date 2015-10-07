import java.io.File
import java.util.Calendar

def getListOfSubDirectories(directoryName: String): Array[String] = {
  (new File(directoryName)).listFiles.filter(_.isDirectory).map(_.getName)
}

def getListOfFiles(directoryName: String): Array[String] = {
  (new File(directoryName)).listFiles.filter(_.isFile).map(_.getName)
}

def getAllFiles(directoryName: String, parentDirectoryName: String = null): Array[Any] = {
  (new File(directoryName)).
    listFiles.
      map(item => {
        if (item.isFile) {
          println(parentDirectoryName + ": " + item.getName)
        } else if (item.isDirectory) {
          getAllFiles(item.getAbsolutePath, item.getName)
        }
      }
    )
}

val path = """/media/Data/Multimedia/Books&sites/Kindle Books/Collection 1"""

val all = getAllFiles(path)
all.map(println(_))
println("Motan tarcat")

case class Author(name: String, books: Book)
case class Book(name: String, author: Vector[Author], publishDate: Calendar, genre: String, format: String)

