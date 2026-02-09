package intro


trait Show[A] {
  def show(a:A): String
}


object Shown {
  def show[A] (a:A) (implicit showObject: Show[A]): String = showObject.show(a)

  implicit val stringSHow: Show[String] = new Show[String] {
    def show(a:String): String = s"String implicitly defined method ${a}"
  }

  implicit val intSHow: Show[Int] = (a:Int) => s"Int implicitly defined method ${a}"

  def main(args: Array[String]): Unit = {
    println(show("Hello"))
    println(show(1))
  }
}

