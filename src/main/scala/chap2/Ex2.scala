package chap2

/*
What is the value of an empty block expression {}? What is its type?
*/
object Ex2 extends App {

  assert( {} == () )
  assert({}.isInstanceOf[Unit])
}
