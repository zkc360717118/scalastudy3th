package basic.spark编程基础scala2_控制结构

object for循环 {
  def main(args: Array[String]): Unit = {
//    println("1 .basic usage")
//    for(i <- 1 to 3){ println(i)}
//
//    for(i <- Array(4,5,6)){println(i)}
//
//    println("2. usage with Guard")
//    for(i <- List(7,8,9) if i%2==0){println(i)}
//
//    println("3 usage with mutiple generators")
//    for(i <- 1 to 5;  j<- 6 to 10) {println(i+":"+j)}

//    println("4 usage with Yield")
    val r = for(i <- Array(1,2,3,4) if i%2 ==0) yield {
      i
    }
    println(r.mkString(","))

  }

}
