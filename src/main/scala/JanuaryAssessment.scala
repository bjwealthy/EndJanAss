/*

1. First character in a string:
val s = theString
println(theString.charAt(0))
2.
 */

//Control Structure and Functions
//Quetion 1
object JanuaryAssessment extends App {
  println("Welcome !")

  def sinumCalculator(input: int): Int = {
    if (input = 0) 0
    else if (input < 0) -1
    else 1
  }

  //Question 2: Null

  //Question 4: for(i <- 10 to 0) println(i)

  //Question 5: for(n <- 0 to 10) println(n)

  /*Question 6:
we use the toInt function
 */

  def productOfUnicode(input: String): Long = {
    var a = 1
    for(character: <- input) {
      a *= input.toInt
    }
    println(a)
  }

  //Question 8:
  def prodUnicodeNoLoop(input: String): Long = {
    input map (character => BigInt(i)) a

  }

  //Question 10
  def power(x: Int, n: Int): Long = {
    if(n>=1) x*power(x, n-1)
    else 1
  }*/

  //Question 11
  



