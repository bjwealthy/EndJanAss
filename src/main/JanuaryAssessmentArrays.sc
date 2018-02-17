import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object JanuaryAssessmentArrays extends App{
  def main(args: Array[String]): sdcv = {

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

  val c = ArrayBuffer(1,2,3,4,5)
  val c2 = for(i <- 0 until c.length) yeild {
    if(i%2==0 % && i<c.length-1) c(i+1)
    else if(i%2!=0 && i!=0) c(i-1)
    else c(i)
  }

  //Question4
  val arrayA = new ArrayBuffer[Int]()
  for(i <- 0 until arrayA.length) {
    val newItemPos = for (elem <- arrayA if elem > 0) yield elem
    val newItemNeg = for (elem <- arrayA if elem <= 0) yield elem
  }