import scala.io.Source
def widthOfLength(s: String) = s.length.toString.length
if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft( // 56
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLine) //2
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line) // 2 or 1
    val padding = " " * numSpaces // two or one space
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")