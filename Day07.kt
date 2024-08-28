//Default Arguements
fun sum(a : Int = 10, b : Int = 20)
{
    val c = a + b
    println(c)
}

fun main()
{
    sum(20, 50)
    sum()
}

-----------------------------------------

//Without Default Arguements
fun sum(a : Int, b : Int)
{
    val c = a + b
    println(c)
}

fun main()
{
    sum(20, 50)
//     sum()		//This will give error since there is no value for parameters a and b
}

----------------------------------------

//Returning from a function
fun main(args: Array<String>)
{
    val a = 10
    val b = 20
    val result = sum(a, b)
    println(result)
}

fun sum(a : Int, b : Int) : Int
{
    val x = a + b
    return x
}

-------------------------------------

//Create a function to convert temperature from Celsius to Fahrenheit and vice vera
//Factorial, Fibonacci


---------------------------------------

//class
class Student
{
    fun result()
    {
        println("Pending")
    }
}

fun main()
{
    var s1 = Student()
    s1.result()
}


