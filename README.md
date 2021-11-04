# Various behaviors of Scala’s Trait

## 1, Mixin Composition
### 1-1, Mixin using extends  
```Scala
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
```
### 1-2, Mixin using with  
```Scala
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
```

## 2, Ordered Trait
Use the methods of the class to automatically increase the methods.  
By doing so, the interface can be enriched.  
```Scala
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
```

## 3, Stackable Modifications
When changing a method of a class, you can Stackable Modifications.  
By doing so, subclass, superclass, and trait can be linearized.  
```Scala
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

```
