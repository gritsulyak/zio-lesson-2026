package zio_otus_kafka.basics

import zio.Console.printLine
import zio.{Scope, ZIO, ZIOAppArgs, ZIOAppDefault}

object ZioForEach extends ZIOAppDefault {
  val prints = List(
    printLine("The"),
    printLine("quick"),
    printLine("brown"),
    printLine("fox")
  )

  val printWords =
    ZIO.collectAll(prints)

  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = printWords
}
