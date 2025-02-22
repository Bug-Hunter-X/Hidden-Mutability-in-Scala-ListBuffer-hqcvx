```scala
import scala.collection.mutable.ListBuffer

class MyClass {
  private val myList = new ListBuffer[Int]()

  def add(x: Int): Unit = {
    myList += x
  }

  def get(): List[Int] = {
    myList.toList // Return a copy to prevent external modification
  }
}

object Main extends App {
  val obj = new MyClass()
  obj.add(1)
  obj.add(2)
  obj.add(3)

  val list = obj.get()
  println(list) //Prints List(1, 2, 3)

  // Incorrect modification attempt - will not modify obj.myList directly
  list.add(4)  
  println(list) //Prints List(1, 2, 3, 4)
  println(obj.get()) //Prints List(1, 2, 3)
}
```