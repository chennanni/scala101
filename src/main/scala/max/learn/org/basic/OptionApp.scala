package max.learn.org.basic

// how to use option
object OptionApp extends App {

  val m = Map(1 -> "A")
  println("***** normal - get a map's value from key")
  println(m(1))

  println("***** option - get a map's value from key")
  println(m.get(1).get)

  println("***** option - get a map's value from key, but not found")
  println(m.get(2))

  println("***** option - get or else")
  println(m.getOrElse(2, "NOT_FOUND"))
  //println(m(2)) // java.util.NoSuchElementException: key not found: 2
  //println(m.get(2).get) // java.util.NoSuchElementException: None.get

}
