class Hunting {
    def hunt(): Unit = {
        println("Find food")
    }
}

// Define trait
trait Cat {
    def bark(): Unit = {
        println("Meow of a cat : meow meow")
    }
}
trait Zebra {
    def escape(): Unit = {
        println("Zebras run")
    }
}

// Mixin trait using "with"
class Savannah extends Hunting with Cat with Zebra{
    override def toString = "wild"
    override def hunt(): Unit = {
        println("Lion aims at zebras")
    }
    override def bark(): Unit = {
        println("Lion barks : Roar! Roar!!!")
    }
    override def escape(): Unit = {
        println("Zebras run at full power")
    }
}

object MixinComposition2 extends App {

    val savannahHunting = new Savannah
    savannahHunting.hunt()
    savannahHunting.bark()
    savannahHunting.escape()
}


// =====================================
//         Output Sample
// =====================================
// $ scalac MixinComposition2.scala
// $ scala MixinComposition2
// Lion aims at zebras
// Lion barks : Roar! Roar!!!
// Zebras run at full power