package chap2

/*
Make the function of the preceding exercise a recursive function.
*/

object Ex9 extends App {

  def product(str: String): Int = {
    val (thisPart, thatPart)= str.splitAt(1)

    if (thatPart.length > 0) {
      thisPart.charAt(0).toInt * product(thatPart)
    } else {
      thisPart.charAt(0).toInt
    }

  }

  assert(product("Hello") == 825152896)
}
