package max.learn.org.basic

object StringApp extends App {

  // print string with variables
  val s = "Hello"
  val name = "Alice"
  println(s + name)
  println(s"Hello$name")

  // multiple lines of string
  val b =
    """
      |hello
      |world
      |alice
    """.stripMargin
  println(b)

}
