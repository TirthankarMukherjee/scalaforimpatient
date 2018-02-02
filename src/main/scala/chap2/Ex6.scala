package chap2

/*
Write a for loop for computing the product of the Unicode codes of all letters
in a string. For example, the product of the characters in "Hello" is 825152896.
*/

object Ex6 extends App {

  var uniProd = 1

  for( c <- "Hello") uniProd *= c.toInt

  assert(uniProd == 825152896)
}
