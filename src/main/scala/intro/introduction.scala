package intro

object introduction extends App {
  println("Hello, app world!")
  var a = 1 + 2
  println(a)

  val b:Unit = println("323")
  a = a+1

  lazy val lazyVal = {
    println("lazy val executed")
    a=a+10
    a
  }

  println("lazy val assigned")

  println(lazyVal)
  println(lazyVal)

  lazy val cond: Boolean = true

  val x: Any = do {
    println("in do")
  } while(!cond)

  println(x)

}
