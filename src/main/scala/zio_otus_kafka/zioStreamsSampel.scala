package zio_otus_kafka

import zio.Console.printLine
import zio.{ZIO, ZIOAppDefault}
import zio.stream.ZStream


object zioStreamsSampel extends ZIOAppDefault {

  val s4 = ZStream(1,2,3)
  s4.runCollect.flatMap(chunk => printLine(chunk))

  override def run: ZIO[Any, Nothing, Unit] = s4.runDrain

  //override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = ???
}
