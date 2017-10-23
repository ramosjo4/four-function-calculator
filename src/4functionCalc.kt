
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
   var result: Double


    if (operand == "+"){
        result = num1+ num2
        println(result)
    }else if(operand == "-"){
        result = num1 - num2
        println(result)
    }else if(operand == "*"){
        result = num1 * num2
        println(result)
    }else if(operand== "/"){
        result = num1 / num2
        println(result)
    }else {
        println("error")
    }



}