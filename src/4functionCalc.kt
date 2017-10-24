
/*
Jose Ramos
10/23/17

A simple four function calculator that will take in two numbers and an operand and
output the outcome.
 */
fun sum (num1: Double, num2: Double): Double {
    var result = num1 + num2
    return result
}
fun difference (num1: Double, num2: Double): Double {
    var result = num1 - num2
    return result
}
fun product (num1: Double, num2: Double): Double {
    var result = num1 * num2
    return result
}
fun quotient (num1: Double, num2: Double): Double {
    var result = num1 / num2
    return result
}

fun main (args: Array<String>){

    println("enter the two numbers followed by the operator which you wish to use.")

   val num1 = readLine()!!.toDouble()
   val num2 = readLine()!!.toDouble()
   val operand = readLine()!!.toString()
   var result: Double


    if (operand == "+"){
        result = sum(num1,num2)
        println(result)
    }else if(operand == "-"){
        result = difference(num1,num2)
        println(result)
    }else if(operand == "*"){
        result = product(num1,num2)
        println(result)
    }else if(operand== "/"){
        result = quotient(num1,num2)
        println(result)
    }else {
        println("error")
    }



}