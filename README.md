# Various behaviors of Scala’s Trait

## Mixin Composition
### MixinComposition1.scala
Mixin using extends  
![スクリーンショット 2021-11-04 15 25 09](https://user-images.githubusercontent.com/36861752/140267809-9d7e6e82-f897-477c-9167-0e4425d00309.png)
### MixinComposition2.scala
Mixin using with  
![スクリーンショット 2021-11-04 15 25 27](https://user-images.githubusercontent.com/36861752/140267839-e6674bde-0c52-400f-a6c1-484b5970a513.png)

## Ordered Trait
### OrderedTrait.scala
Use the methods of the class to automatically increase the methods.  
By doing so, the interface can be enriched.  
![スクリーンショット 2021-11-04 15 25 45](https://user-images.githubusercontent.com/36861752/140267884-db244abc-c26b-4de1-b2fd-77ef1fe7ce1d.png)

## Stackable Modifications
### StackableModifications.scala
When changing a method of a class, you can Stackable Modifications.  
By doing so, subclasses, superclasses, and traits can be linearized.  
![スクリーンショット 2021-11-04 15 26 07](https://user-images.githubusercontent.com/36861752/140267903-356f2a5e-c871-4407-be21-bd98b1d024e7.png)
