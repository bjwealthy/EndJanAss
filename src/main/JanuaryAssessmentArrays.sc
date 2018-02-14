import scala.util.Random

object JanuaryAssessmentArrays extends App{
  def main(args: Array[String]): sdcv = {

  }

  //Question1
  def randomInt(i: Int) = {
    Array.fill(i){
      Random.nextInt(i)
    }
  }

  //Question2
  val a = Array[Int](1,2,3,4,5)
  a                                         //> res1: Array[Int] = Array(1, 2, 3, 4, 5)
  for(i <- 0 until (if(a.length % 2 == 0) a.length else a.length - 1) if(i % 2 == 1) ) {
    val temp = a(i)
    a(i) = a(i-1)
    a(i-1) = temp


}