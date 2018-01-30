package io.udash.demos.files

import io.udash.demos.files.jetty.ApplicationServer
import io.udash.logging.CrossLogging

import scala.io.StdIn

object Launcher extends CrossLogging {
  def main(args: Array[String]): Unit = {
    val server = new ApplicationServer(8080, "frontend/target/UdashStatics/WebContent")
    server.start()
    logger.info(s"Application started...")

    // wait for user input and then stop the server
    logger.info(s"Click `Enter` to close application...")
    StdIn.readLine()
    server.stop()
  }
}

       