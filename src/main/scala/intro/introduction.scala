package intro

object introduction extends App {
  var a = 1 + 2
  println(a)
  a = a+1

  val b:Unit = println("bbb")

  val inc : Int => Int = _ + 1 // x => x + 1

  lazy val lazyVal = {
    println("lazy val executed")
    10
  }

  println("lazy val assigned")

  println(lazyVal)
  println(lazyVal)

  lazy val cond: Boolean = true

  val x: Any = do {
    println("while lazy cond")
  } while(!cond)

  println(x)

}
