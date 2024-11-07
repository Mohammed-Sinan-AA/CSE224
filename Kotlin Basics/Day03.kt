fun main()
{
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val words: Array<String> = arrayOf("Kotlin", "Java", "Python")
    val squares = Array(5) {i -> i*i}
    val firstNumber = numbers[0]
    val secondNumber = numbers[1]
    println("First Number: $firstNumber")
    println("Second Number: $secondNumber")
    //Modifying
    numbers[0] = 100
    words[1] = "C++"
    println(numbers[0])
    println(words[1])
    for (num in numbers)
    {
        println(num)
    }
    //2 Dimensional Array
    val Array2D: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println("Element ")
}

------------------------------------------------------------------

fun main(args: Array<String>)
{
    val x: Int = 100
    val y: Long = x.toLong()
    println(y)
}

-----------------------------------------------------------------

fun main()
{
    var a = "hello"
    var b : String = a as String
    println("Unsafe casting result : $b")
    val c : Int = a as? Int
    println("Unsafe Casting Result : $c")
}

------------------------------------------------------------
