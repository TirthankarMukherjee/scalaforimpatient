package chap3

/*
Write a code snippet that sets a to an array of n random integers between 0
(inclusive) and n (exclusive).
*/


class Ex1 extends App {

val nums = Array[Int](10)

  for(i <- 0 until nums.length){
      nums(i) = scala.util.Random.nextInt
  }
  
}
