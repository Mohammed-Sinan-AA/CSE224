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
fun toFahrenheit(celsius: Double): Double {
    return ((celsius * 9/5) + 32)
}

fun toCelsius(fahrenheit: Double): Double {
    return ((fahrenheit - 32) * 5/9)
}

fun main() {
    val celsius = 25.0
    val fahrenheit = toFahrenheit(celsius)
    println("$celsius C is $fahrenheit F")

    val fahrenheitValue = 77.0
    val celsiusValue = toCelsius(fahrenheitValue)
    println("$fahrenheitValue F is $celsiusValue C")
}

--------------------------------------------------

//Fibonacci
fun fibonacci(n: Int): Int {
    if (n <= 1)
        return 1
    else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun main() {
    val n = 10
    println("Fibonacci of $n is: ${fibonacci(n)}")
}

-------------------------------------------------
//Factorial
fun factorial(n: Int): Int {
    if (n <= 1){
        return 1
    }
    else{
        return n * factorial(n - 1)
    }
}

fun main() {
    val n = 5
    println("Factorial of $n is: ${factorial(n)}")
}
    
--------------------------------------------------

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


