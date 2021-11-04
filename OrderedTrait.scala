// Mixin Ordered trait
class Comparison(val num: Int) extends Ordered[Comparison] {
    def compare(that: Comparison) = {
        val res = this.num - that.num

        if (res == 0) {
            0
        }else if (res < 0) {
            -1
        }else {
            1
        }
    }
}

object OrderedTrait extends App {

    val valueOne = new Comparison(1)
    val valueTwo = new Comparison(2)

    print("1 > 2  : ")
    println(valueOne > valueTwo)
    print("1 >= 2 : ")
    println(valueOne >= valueTwo)
    print("1 < 2  : ")
    println(valueOne < valueTwo)
    print("1 <= 2 : ")
    println(valueOne <= valueTwo)
    print("1 == 2 : ")
    println(valueOne == valueTwo)
}


// =====================================
//         Output Sample
// =====================================
// $ scalac OrderedTrait.scala 
// $ scala OrderedTrait
// 1 > 2  : false
// 1 >= 2 : false
// 1 < 2  : true
// 1 <= 2 : true
// 1 == 2 : false