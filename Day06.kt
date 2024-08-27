fun main() 
{
    for (i in 1..5)
    {
        println("Number: $i")
    }
}

-------------------------------

fun main() 
{
    for (i in 1 until 5)
    {
        println("Number: $i")
    }
}

------------------------------

fun main()
{
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (i in fruits.indices)
    {
        println(i)
    }
    for (fruit in fruits)
    {
        println("Fruit: $fruit")
    }
}

-----------------------------

fun main()
{
    var i = 5
    do
    {
        println("Value: $i")
        i--
    }
    while (i > 0)
}

--------------------------

fun main()
{
    var i = 1
    do
    {
        println("Value: $i")
        i++
    }
    while (i < 6)
}

------------------------------

fun demo()
{
    println("Hello World!")
}

fun main(args: Array<String>)
{
    demo()
    println("Bye")
}

---------------------------------

  
