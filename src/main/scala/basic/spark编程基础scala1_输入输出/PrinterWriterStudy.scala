package basic.spark编程基础scala1_输入输出

import java.io.PrintWriter

object PrinterWriterStudy {
  def main(args: Array[String]): Unit = {
    val outputFile = new PrintWriter("test.txt")
    outputFile.println("hello world")
    outputFile.println("SPARK IS GOOD")
    val i = 9
    outputFile.println("%3d --> %d".format(i,4))

    outputFile.close()
  }
}
