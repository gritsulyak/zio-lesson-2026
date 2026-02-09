package intro

object collections  extends App {
  val l: List[String] = List("a", "bcv", "cgfdgf")
  val s: Set[String] = Set("aS", "bS", "cS")
  val m: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

  var sl = l.toSet

  println(sl)

  val c3 = l.groupBy(x=>x).map(x=>(x._1,x._2.size))
  println(c3)

  println(l.map(_.length))

  val demoC = 1::2::3::Nil

  println(s"fold: ${demoC.foldRight(0)((x,y) => x+y)}")

  val ListOfList = List(1,2,3) :: List(4,5,6) :: List(7,8,9) :: Nil

  println(ListOfList.map(_.sum))

}
