package week2.objects

class Box(val width: Int, val length: Int, val height: Int) {
  val volume: Int = width * length * height
  var content: Int = 0

  def isFull: Boolean = {
    if (this.content < this.volume) {
      false
    }  else {
      true
    }
  }

  def fill(volume: Int): Unit = {
    if (!isFull) {
      this.content += volume
    }
  }

  def isLarger(otherBox: Box): Boolean = {
    this.volume > otherBox.volume
  }

  def canContain(otherBox: Box): Boolean = {
    if ((this.width > otherBox.width) && (this.length > otherBox.length) && (this.height > otherBox.height)) {
      true
    } else {
      false
    }
  }

  def canFitThrough(width: Int, height: Int): Boolean = {
    if (((this.width < width) || (this.length < width)) && (this.height < height)) {
      true
    } else {
      false
    }
  }
}
