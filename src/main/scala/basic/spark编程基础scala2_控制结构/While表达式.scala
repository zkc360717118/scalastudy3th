package basic.spark编程基础scala2_控制结构

object While表达式 {
  def main(args: Array[String]): Unit = {
    // while sentence 1
    while (1>0){
      println("true")
    }


    //while sentence 2
    do{
      println("will execute once")
    }while (1<0)
  }

}
