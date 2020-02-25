package basic.spark编程基础scala1_输入输出

import scala.io.Source

object SourceFile {
  def main(args: Array[String]): Unit = {
    val inputFile = Source.fromFile("test.txt")
    for(line <- inputFile.getLines())
      {
        println(line)
      }
    inputFile.close()
  }

}
