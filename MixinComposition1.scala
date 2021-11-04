// Define trait
trait Cat {
    def bark(): Unit = {
        println("meow meow")
    }
}

// Mixin trait using "extends"
class Savannah extends Cat {
    override def toString = "wild"
    override def bark(): Unit = {
        println("Roar! Roar!!!")
    }
}

object MixinComposition1 extends App {

    val savannahCat = new Savannah
    savannahCat.bark()
}


// =====================================
//         Output Sample
// =====================================
// $ scalac MixinComposition1.scala
// $ scala MixinComposition1
// Roar! Roar!!!