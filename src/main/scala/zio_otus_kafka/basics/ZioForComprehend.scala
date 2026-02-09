package zio_otus_kafka.basics

import zio.Console.{printLine, readLine}
import zio._

object ZioForComprehend extends ZIOAppDefault {
  val echo =
    for {
     line <- readLine
     _ <- printLine(line)
    } yield ()

  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = echo

}

