package zio_otus_kafka.basics

import zio.Console.{printLine, readLine}
import zio._

import scala.io.StdIn

object ZioWith extends ZIOAppDefault {
  val firstName =
    ZIO.attempt(StdIn.readLine("What is your first name?"))

  val lastName =
     ZIO.attempt(StdIn.readLine("What is your last name?"))

  val fullName =
     firstName.zipWith(lastName)((first, last) => s"$first $last")
  val helloWorld =
     ZIO.attempt(print("Hello, ")) *> ZIO.attempt(print("World!\n"))
  // В run нужно не только вычислить значение, но и вывести его
  override def run = for {
    name <- fullName
    _    <- Console.printLine(s"Hello, $name!")
    world <- helloWorld
    _    <- Console.printLine(world)
  } yield ()
}
