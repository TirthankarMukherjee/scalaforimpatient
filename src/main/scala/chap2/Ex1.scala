package chap2

/*
The signum of a number is 1 if the number is positive, –1 if it is negative, and
0 if it is zero. Write a function that computes this value.
*/

object Ex1 extends App {

  def signum(x: Int): Int = if (x > 0) 1 else if (x < 0) -1 else 0

  assert(-1 == signum(-5))
  assert(1 == signum(3))
  assert(0 == signum(0))

}
