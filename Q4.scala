package tutorial3

object Q4 {
  var coverPrice:Double = 24.95;
  
  def cost(numBooks:Int):Double={
    val BookCost = ((coverPrice*0.60)*numBooks)
    val shippingCost = (3.0 + (0.75 * (numBooks-1)))
    val totalCost = BookCost + shippingCost
    return (totalCost)
  }
  
  
  def main(args:Array[String]):Unit ={
    println(cost(60))
  }
}