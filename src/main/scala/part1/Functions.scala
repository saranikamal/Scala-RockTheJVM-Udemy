package part1

object Functions extends App {

  //Empty paren function
  def something():Int =  42
  println(something())
  println(something)

  // Parameterless function
  def somethingElse:Int = 42
  println(somethingElse)
  println(somethingElse)

  //A repeated function
  def concatNTimes(aString:String, number:Int):String = {
    if (number <= 0) aString
    else aString + concatNTimes(aString, number-1)
  }

  println(concatNTimes("hello", 3))

  // WHEN YOU NEED LOOPS. USE RECURSION

  // Exercise

  //1. Greeting function
  def greeting(name:String, age:Int):String = s"Hello, my name is $name and I am $age years old."

  println(greeting("Sara", 28))

  //2. Factorial function
  def factorial(n:Int):Int = if(n<=0) 1 else n * factorial(n-1)

  println(factorial(1))
  println(factorial(3))
  println(factorial(5))

  //3. Fibonacci function
  def fibonacci(n:Int):Int = if(n<=2) 1 else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(5))
  println(fibonacci(7))

  //4. If a number is prime
  // Auxiliary functions
}
