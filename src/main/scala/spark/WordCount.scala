package spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount extends App with Serializable {
  val sparkconf = new SparkConf().setAppName("WordCountByKevin").setMaster("local[2]")
  val sc = new SparkContext(sparkconf)
  println(sc.defaultParallelism)
  val sourceFlat:RDD[Int] = sc.parallelize(1 to 5)
  val x = List(1,2,3)

//  println(sourceFlat.getNumPartitions)
//  val sourceFlatTwo = sourceFlat.map(1 to _)
//  println(sourceFlatTwo.flatMap(x =>x).collect().toList.foreach(print))

//
  sc.stop()

}
