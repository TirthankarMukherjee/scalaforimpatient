package chap2
/*
Write a function product(s : String) that computes the product, as described
in the preceding exercises.
*/
object Ex8 extends App {

  def product(str : String) : Int = str.map(_.toInt).fold(1){(acc,i) => acc * i}

  assert (product("Hello") == 825152896) 
}
