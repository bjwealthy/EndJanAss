import java.util.Scanner

object MapsTuples extends App {
  override def main(args: Array[String]): Unit = {
  }

  //Question1
  val favourites = Map("Frequency Enhancer" -> 1, "Imperial leather" -> 20, "Solar panel" -> 15, "Photo Galeria" -> 500)
  val priceDiscounted = for((g, pD) <- favourites) yield (g, pD*(9/10))

  //Question2
  val words = new java.util.Scanner(new java.io.File("theFile"))
  while (words.hasNext())
    process words.next()

  //Question3


}