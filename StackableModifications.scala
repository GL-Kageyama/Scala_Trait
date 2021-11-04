abstract class Calculation {
    def calc(x: Int): Unit 
}

class Addition extends Calculation {
    def calc(x: Int): Unit = {
        println(x + x)
    }
}

// Define traits for Stackable Modifications
trait Squared extends Calculation {
    abstract override def calc(x: Int): Unit = {
        super.calc(x * x)
    }
}
trait Cube extends Calculation {
    abstract override def calc(x: Int): Unit = {
        super.calc(x * x * x)
    }
}

// Mixin Stackable modifications traits
class AddSquCalc extends Addition with Squared
class AddCubeCalc extends Addition with Cube

object StackableModifications extends App {

    val add = new Addition
    print("3 + 3         = ")
    add.calc(3)

    val addSqu = new AddSquCalc
    print("3*3 + 3*3     = ")
    addSqu.calc(3)

    val addCube = new AddCubeCalc
    print("3*3*3 + 3*3*3 = ")
    addCube.calc(3)
}


// =====================================
//         Output Sample
// =====================================
// $ scalac StackableModifications.scala 
// $ scala StackableModifications
// 3 + 3         = 6
// 3*3 + 3*3     = 18
// 3*3*3 + 3*3*3 = 54