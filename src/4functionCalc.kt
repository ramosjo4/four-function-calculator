
/*
Jose Ramos
10/23/17

A simple four function calculator that will take in two numbers and an operand and
output the outcome.
 */
fun main (args: Array<String>){

    println("enter the two numbers followed by the operator which you wish to use.")

   val num1 = readLine()!!.toDouble()
   val num2 = readLine()!!.toDouble()
   val operand = readLine()!!.toString()

    println(num1 + "\n " + num2 + " \n" + operand)




}