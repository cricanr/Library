import com.ebook.library.InputReader

val path = "~/conf"
val files = InputReader.getAllFiles(path)
println(files.getOrElse("").toString)