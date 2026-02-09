package intro

object functions extends App {

  private def curriedSum(x:Int)(y:Int) = x+y

  println(curriedSum(1)(2))

  println({var a = curriedSum(5)_; a(2)})

  val partial : PartialFunction[Any, String] = {
    case x: Int if x%2 == 0 => s"$x is even"
    case x: String => s"$x is string"
  }

  println(partial(2))
  println(partial("String"))
}

