package chap3

/*
Write a loop that swaps adjacent elements of an array of integers. For example,
Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
*/

object Ex2 extends App {

  val numArr = Array(1, 2, 3, 4, 5)

  for (i <- 0 until numArr.length) {
    if (numArr(i) % 2 == 0 && i > 0) {
      val temp = numArr(i)
      numArr(i) = numArr(i - 1)
      numArr(i - 1) = temp
    }
  }

  assert(numArr.deep.mkString == "21435")

}
