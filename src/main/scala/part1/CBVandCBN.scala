package part1

object CBVandCBN extends App {

  def calledByValue(n:Long): Unit = {
    println("call by value: " + n)   // println("call by value: " + 107825060188700)
    println("call by value: " + n)   //  println("call by value: " + 107825060188700)

    // So same value is passed as parameter, because the value is first evaluated and then passed to the function. So both times the same value is passed
  }

  def calledByName(n: => Long): Unit = {
    println("call by name : " + n)   // println("call by name: " + System.nanoTime())
    println("call by name : " + n)   // println("call by name: " + System.nanoTime())

    // So each time the function is called the expression System.nanoTime is evaluated.
    // This means a value is not passed as parameter, the EXPRESSION itself is passed
  }

  calledByValue(System.nanoTime())
  println("\n")
  calledByName(System.nanoTime())

  def infinite():Int = 1 + infinite()
  def printFirst(x:Int, y: => Int) = println(x)

  // println(printFirst(infinite(), 2))  --> error
  printFirst(34, infinite())

}
