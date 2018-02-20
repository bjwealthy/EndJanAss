import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object JanuaryAssessmentArrays extends App{

  }

  //Question1
  def randomInt(i: Int) = {
    Array.fill(i) {
      Random.nextInt(i)
    }
  }

  //Question2
  val a = ArrayBuffer[Int]()
  val a2 = for(i <- 0 until a.length) yield{
    if(i%2 == 0 && i<a.length-1) a(i+1)
    else if(i%2 !=0 && i!=0) a(i-1)
    else a(i)
  }



  //Question3

  val c = ArrayBuffer[Int](1,2,3,4,5)
  val c2 = for(i <- 0 until c.length) yeld {
    if(i%2==0 % && i<c.length-1) c(i+1)
    else if(i%2!=0 && i!=0) c(i-1)
    else c(i)
  }

  //Question4
  val arrayA = ArrayBuffer[Int]()
  for(i <- 0 until arrayA.length) {
    val newItemPos = for (elem <- arrayA if elem > 0) yield elem
    val newItemNeg = for (elem <- arrayA if elem <= 0) yield elem
  }

  //Question5
  val array5 = Array[Double](arraySize)
  array5.sum/arraySize

  //Question 6
  val array6 = Array[Int](size)
  val array6Sorted = (_>_)

  //Question7
  val array7 = Array[type](size)
  array7.distinct

  //Question 8
  val array8 = ArrayBuffer[Int]()
  for(i <- 0 until arrayA.length) {
  val newItemPos = for (elem <- array8 if elem > 0) yield elem
  val newItemNeg = for (elem <- array8 if elem <= 0) yield elem
}

  //Question9

  //Question10



