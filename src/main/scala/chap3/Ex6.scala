package chap3

/*
How do you rearrange the elements of an Array[Int] so that they appear in
reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
*/
object Ex6 extends App {

  val arr = Array(2,5,-3,6,9,12,0)
  val arrSortedReverse = arr.sortWith(_.compareTo(_) > 0)

  println(arrSortedReverse.deep.mkString(","))
  assert(arrSortedReverse.sameElements(Array(12,9,6,5,2,0,-3)))

}
