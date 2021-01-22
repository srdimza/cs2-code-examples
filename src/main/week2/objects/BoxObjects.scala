package week2.objects

object BoxObjects {

  def main(args: Array[String]): Unit = {
    val smallBox: Box = new Box(1, 1, 1)
    val largeBox: Box = new Box(10, 20, 30)
    val narrowBox: Box = new Box(2, 15, 25)
    val mediumBox: Box = new Box(8, 9, 10)

    println("small box is larger than medium?", smallBox.isLarger(mediumBox))
    println("can large contain medium?", largeBox.canContain(mediumBox))
    println("can narrow fit medium?", narrowBox.canContain(mediumBox))
    println("can large fit through hole 12x35?", largeBox.canFitThrough(12, 35))
    println("is medium box full?", mediumBox.isFull)
    println("filling medium box", mediumBox.fill(5))
    println("medium box has inside: ", mediumBox.content)
    mediumBox.content = 10

  }

}
