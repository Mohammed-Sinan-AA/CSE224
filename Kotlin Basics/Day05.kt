fun main()
{
    var temperature = 25 
    if (temperature > 20)
    {
        println("It's a warm day")
    }
}

-------------------------------------------------

fun main()
{
    var temperature = 15 
    if (temperature > 20)
    {
        println("It's a warm day")
    }
    else
    {
        println("Good weather")
    }
}

--------------------------------------------

  fun main()
{
    var marks = 85 
    if (marks >= 90)
    {
        println("A grade")
    }
    else if (marks >=85)
    {
        println("B grade")
    }
    else if (marks >=70)
    {
        println("C grade")
    }
    else
    {
        println("D grade")
	}
}

----------------------------------------

//Create a calculator by using if-else using all arithemetic operators.
fun main()
{
    val a = 10
    val b = 15 
    var operation = "add"
    if (operation == "add")
    {
        println(a+b)
    }
    else if (operation == "sub")
    {
        println(a-b)
    }
    else if (operation == "mul")
    {
        println(a*b)
    }
    else if (operation == "div")
    {
        if (b != 0)
        {
            println(a/b)
        }
        else 
        {
            println("Error: Division by Zero")
        }
       
    }
    else
    {
        println("Unsupported Operator")
    }
    
}

----------------------------------------------

fun main()
{
    val age = 15
    if(age < 13)
    {
        println("You are a child.")
    }
    else if (age in 13..19)
    {
        println("You are a teenager.") 
    }
    else if (age in 20..64) 
    {
        println("You are an adult.")
    }
    else
    {
        println("You are a senior.")
    }
}

----------------------------------------------

fun main() 
{
    val dayofweek = 4
    val dayname = when(dayofweek)
    {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    print("Day of the week: $dayname")
}

---------------------------------------------------

fun main() 
{
    val number = 8
    when
    {
        number%2 == 0 -> println("$number is even")
        number%2 != 0 -> println("$number is odd")
        else -> println("Unexpected number")
    }
}

-----------------------------------------------------

