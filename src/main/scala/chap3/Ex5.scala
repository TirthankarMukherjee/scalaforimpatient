package chap3;

/*
How do you compute the average of an Array[Double]?
*/
object Ex5 extends App {

  val arr = Array(2.0,-4.0,11.0)

  val average = arr.sum / arr.length

  assert(average == 3.0)
}
