package intro

object collections  extends App {
  val l: List[String] = List("a", "bcdef", "c") // List<String>
  val m: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

  var s = l.toSet

  println(s)

  val c3 = l.groupBy(x=>x).map(x=>(x._1, x._2.size))

  println(c3)

  val demoC = 1::2::3::Nil

  println(demoC)

  println(s"fold: ${demoC.foldRight(0)((x, y) => x + y)}")
  println(s"fold: ${demoC.reduce((x, y) => x + y)}")

  val demoD = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) :: List(1, 2, 3, 4) :: List(1,12) :: Nil

  demoD.filter(x => x.sum > 10).foreach(x=>println(x.mkString(",")))
}
