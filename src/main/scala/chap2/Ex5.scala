package chap2

/*
Write a procedure countdown(n: Int) that prints the numbers from n to 0.
*/
object Ex5 extends App {

  def countdown(x: Int) {
    if (x < 0) return

    println(x)
    countdown(x - 1)

  }

  countdown(10)

}
