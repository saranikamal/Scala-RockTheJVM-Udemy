package part1

import java.beans.Statement

object Expressions extends App {

  /*Expressions evaluate to a "vale" and have a "type"*/

  /*Changing a variable is called a "side effect"*/

  /*Instruction or Statement vs Expressions*/

/*  An Instruction is what we tell the computer to DO. In  imperative languages
  like Java we always use instructions. Do this Do that. Do something
   Print to console, multiply the variable, send this to server etc..*/

 /* An Expression is something that has a "value" and/or a "type".
    In functional programming and Scala every single bit of code will compute
    a value. Expression means give me the value of something */

  var aVariable = 3
  val weirdVariable = (aVariable = 5) //weirdVariable is of type Unit
  println(weirdVariable) // println is an expression with side effect

  /* This is because of side effect
  * side effects include: print, reassigning of a var, and while loop */

  //code blocks
  val codeBlock = {

    val z =1
    val y = z+1

    if(y > 1 ) "hello" else "goodbye" // in Scala we say if Expression. Because if evaluates to something
  }

  // In Scala a code block is also an Expression and its value and type is the type and vale of the last expression.
  // everything defined inside it is not in scope outside.

  /*Final note is that instructions are executed like in Java, expressions are evaluated like in Scala!*/
}
