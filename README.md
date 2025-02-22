# Hidden Mutability in Scala ListBuffer

This example showcases a subtle issue related to mutability when using `scala.collection.mutable.ListBuffer` and returning a copy of its contents. Although seemingly immutable from the outside due to returning a copy (`toList`), the original `ListBuffer` remains mutable.  This can lead to unexpected consequences if the returned list is modified, as shown in the example.  The solution demonstrates how to return a truly immutable copy to avoid this issue.

## How to run

Simply save the code as `bug.scala` and `bugSolution.scala`, then compile and run using the Scala compiler (scalac) and interpreter (scala):

```bash
scalac bug.scala
scala bug

scalac bugSolution.scala
scala bugSolution
```