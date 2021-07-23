

object Main
{

  def main(args:Array[String])
  {
    Checkout.orderApplesAndOranges
  }

  case class Orange(val price:Int=60)
  case class Apple(price:Int=25){}
  object Checkout {
    def orderApplesAndOranges={
      val order = scala.io.StdIn.readLine().split(" ").toList
      val a = Apple()
      val o = Orange()
      format(orderApples(order,a)+orderOranges(order,o))
    }

    def format(price:Double): Unit ={
      println("£" + price/100)
    }

    def orderApples(items: List[String],apple: Apple)={
      val apples=for(item<-items if(item.toLowerCase=="apple")) yield apple.price
      if (apples.length==1) apple.price else{
        if(apples.length%2==0 ){ apples.sum/2}else (apples.length*apple.price/2)+ apple.price
      }

    }
    def orderOranges(items: List[String],orange: Orange)={
      val oranges=for(item<-items if(item.toLowerCase=="orange")) yield orange.price

      ((oranges.length/3) *orange.price*2) +((oranges.length%3) * orange.price)

    }
  }





}