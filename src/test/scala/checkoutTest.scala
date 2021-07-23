import Main.{Apple, Checkout, Orange}
import org.scalatest.{FlatSpec, Matchers}

class checkoutTest extends FlatSpec with Matchers {

  "Fruit" can "have the correct default price" in {
    val orange = Orange()
    val apple = Apple()
    orange.price should be (60)
    apple.price should be (25)
  }

  "ordering two apples" should "amount to 50p" in {
    val apple = Apple()
    val checkout=Checkout
    val list=List("Apple","Apple")
    checkout.orderApples(list,apple) should be (50)
  }

  "ordering 0 apples" should "amount to 0" in {
    val apple = Apple()
    val checkout=Checkout
    val list=List("","")
    checkout.orderApples(list,apple) should be (0)
  }

  "ordering two oranges" should "amount to 120p" in {
    val orange = Orange()
    val checkout=Checkout
    val list=List("orange","orange")
    checkout.orderOranges(list,orange) should be (120)
  }

}
