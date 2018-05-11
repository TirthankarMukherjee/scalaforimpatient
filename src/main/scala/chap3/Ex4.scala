package chap3;

/*
Given an array of integers, produce a new array that contains all positive
values of the original array, in their original order, followed by all values that
are zero or negative, in their original order.
*/
object Ex4 extends App {

	val arr = Array(2,1,0,-5,11)

	val positive = for(elm <- arr if elm > 0) yield elm
	val zeorOrNegetive = for(elm <- arr if elm <= 0) yield elm

	assert(positive.sameElements(Array(2,1,11)))
	assert(zeorOrNegetive.sameElements(Array(0,-5)))

}
