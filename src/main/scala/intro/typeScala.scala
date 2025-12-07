package intro


trait Show[A] {
  def show(a: A): String
}

object Shown {
  def show[A](a: A)(implicit showObject: Show[A]): String = showObject.show(a)

  implicit val stringShow: Show[String] = new Show[String] {
    def show(a: String): String = s"String Implicitly defined method ${a}"
  }

  implicit val intShow: Show[Int] = (a: Int) => s"Int Implicitly defined method ${a}"

  def main(args: Array[String]): Unit = {
    println(show(202))
    println(show("hello"))
  }
}
