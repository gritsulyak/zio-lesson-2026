package intro

object functions extends App {

  def sum(x: Int, y: Int): Int = x+y

  println(sum(5, 2))

  private def curriedSum(x: Int)(y: Int): Int = x+y

 val carriedVal : Int => Int = _ + 1

  println({var a = curriedSum(5)_; a(2)})

  val partialEvenBumbersDetector: PartialFunction[Any, String] = {
    case x: Int if x % 2 == 0 => s"$x is even"
    case x: Int => s"$x is not even Int"
    case x: String => "some String type"
    case x: Any => "some any type"
  }

  println(partialEvenBumbersDetector(3))
  println(partialEvenBumbersDetector("hello"))


}
