```scala
import scala.collection.immutable.List

class MyClass {
  private val myList = List.empty[Int]

  def add(x: Int): MyClass = {
    new MyClass(x :: myList) // Functional update
  }

  def get(): List[Int] = {
    myList // Returns an immutable List
  }

  private def this(list: List[Int]) = {
    this()
    this.myList = list
  }
}

object Main extends App {
  val obj = new MyClass()
  val obj2 = obj.add(1).add(2).add(3)

  val list = obj2.get()
  println(list) // Prints List(3, 2, 1)

  // Attempting to modify the immutable list throws an exception
  // list.add(4) // Compilation error. Methods like add() are unavailable for immutable Lists. 
  println(obj2.get()) //Prints List(3, 2, 1)
}
```