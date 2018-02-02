package chap2

/*
Write a Scala equivalent for the Java loop
for (int i = 10; i >= 0; i--) System.out.println(i);
*/
object Ex4 extends App {

  for( i<- 10 to (0, -1) ) println( i )

  (0 to 10).reverse.foreach(println)
}
