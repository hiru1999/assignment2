package tutorial3

object Q3 {
  
  def volume(r:Double):Double = (4/3)*math.Pi*r*r*r;
  
  def main(args:Array[String]):Unit ={
    println(volume(5))
  }
}