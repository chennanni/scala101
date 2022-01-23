package max.learn.org
package collection

object FlatMapApp extends App {

  // flatten: 把多个小的 list，合并铺平
  println
  println("***** flatten")
  val f = List(List(1, 2), List(3, 4), List(5, 6))
  println("original list: " + f)
  println("flatten list: " + f.flatten)

  println
  println("***** flatmap")
  println("original map: " + f.map(_.map(_ * 2)))
  println("flatmap: "  + f.flatMap(_.map(_ * 2))) // 先map，后flatten

  println
  println("***** flatmap usage: read file and print")
  val txt = scala.io.Source.fromResource("wordcount.txt").mkString
  val txts = List(txt)

  // row count
  val rows = txts.flatMap(x => x.split("\r\n")).map(x => (x,1))
  println(rows)

  // word count
  val words = txts.flatMap(x => x.split("\r\n| ")).map(x => (x,1))
  println(words)

}
