package chap2

object Ex7 extends App {

  val result = "Hello".map(_.toInt).fold(1) { (acc, i) => acc * i }

  assert(result == 825152896)
}
