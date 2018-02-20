import java.util.Scanner

object MapsTuples extends App {
  
  //Question1
  val favourites = Map("Frequency Enhancer" -> 1, "Imperial leather" -> 20, "Solar panel" -> 15, "Photo Galeria" -> 500)
  val priceDiscounted = for((g, pD) <- favourites) yield (g, pD*(9/10))

  //Question2
  def wordCounter(theFile: String) Unit =
  {
    val readWords = new java.util.Scanner(new java.io.File("theFile"))
    val words = readWords.nextInt()
    while (readWords.hasNext())
      process readWords
    .next()
    val newMap = collection.mutable.Map[String, Int]()
    if (readWords.contains(words)
      readWords (word) = 1)
  }
  for (key, value) <- readWords)
      println(key + " " value)

  //Question3
  def wordCounter(theFile: String): Unit = {
    val readWords = new java.util.Scanner(new java.io.File(thisFile))
    val newMap = Map[String, Int]()
    while(readWords.hasNext()){
      val words = readWords.next()
      newMap += (word -> (container.getOrElse(word, 0) +1))
    }
    println(newMap)

  }

  //Question4
  def wordCounter(theFile: String) : Unit = {
    val readWords = new java.util.Scanner(new java.io.File(theFile))
    var newMap = collection.mutable.SortedMao[String, Int]()
    while(readWords.hasNext()){
      val words = readWords.next()
      readWords += (words -> (readWords.getOrElse(words, 0) + 1))
    }
    println(readWords)

  }



}