object HelloSbt extends App {
  println(box("Sbt says Hello!!"))
  println("Factorial of 7 is : " + fac(7))

  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
  def box(s: String) {
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }

  /*
  The signum of a number is 1 if the number is positive, –1 if it is negative, and
  0 if it is zero. Write a function that computes this value.
  */

  def signum(x: Int): Int = if (x > 0) 1 else if(x < 0) -1 else 0;

}
