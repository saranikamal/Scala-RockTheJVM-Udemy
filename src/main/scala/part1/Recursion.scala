package part1

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  /*Tail recursion = use the recursive call as the LAST expression*/
  @tailrec
  def factorial(n:Int, accumulator: Int):BigInt =
    if(n <= 1) accumulator
    else factorial( n-1, n * accumulator)

  println(factorial(10, 1))

  /*If you need a loop, use TAIL recursion*/

  //Exercise for tail recursion:

  //1. write a function to concat a string n times
  @tailrec
  def concatStringNTimes(aString: String, n: Int, stringAccumulator: String): String =
    if (n <= 0) stringAccumulator
    else concatStringNTimes(aString, n-1, aString + stringAccumulator)

  println(concatStringNTimes("hello ", 3 , ""))


  //2. write fibonacci
  // fib n = fib n-1 + fib n-2 this means two recursions on fibonacci
  // Rule of thumb is however many recursion calls we have, that's how many accumulators we need in our tail recursive function

}
