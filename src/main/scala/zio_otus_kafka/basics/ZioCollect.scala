package zio_otus_kafka.basics

import zio.Console.printLine
import zio.{ZIO, ZIOAppDefault}


object ZioCollect  extends ZIOAppDefault {
  val printNumbers =
    ZIO.foreach(1 to 100) { n =>
    printLine(n.toString)
    }
  // run
  override def run = printNumbers
}
