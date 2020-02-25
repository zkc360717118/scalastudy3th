package basic.spark编程基础scala1_输入输出
import java.io._

object generateCSVfile {
  def main(args: Array[String]): Unit = {
    val avgs = List(Array(1,2),Array(3,4))

    printToFile(new File("test.csv")) {
           p => avgs.map{
              x=> p.println(x.mkString(","))
            }
    }
  }

  def printToFile(f: java.io.File)(op: java.io.PrintWriter => Unit)
  {
    val p = new java.io.PrintWriter(f)
//    p.write("asin,")
//    p.write("rating_avg\n")
    try { op(p) }

    finally { p.close() }
  }

//  val avgs = rating.rdd
//    .map( t=> (t(0),t(1)).toString().replaceAll("\\(","").replaceAll("\\)",""))
//    .collect()

}
