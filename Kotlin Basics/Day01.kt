fun main(args:Array<String>)
{
    var a = 40
    print(a)
//     var try = 20 
//     print(try)
}

------------------------------


fun main(args:Array<String>)
{
    var a = 40
    print(a)
    var `try` = 20 
    print(`try`)
}

--------------------------------


fun main(args:Array<String>)
{
    var a = 40
    print(a)
    val b = 30
    b = b+a 
    print(b)
}

-------------------------------

fun main()
{
    var a = 40
    var b : String
    print(a)
}

-------------------------------

fun main()
{
    var message = "hello"
    print(message)
}
print(message)
Syntax error: Expecting a top level declaration.

---------------------------------

class test1()
{
    var message = "hello"
    fun test2()
    {
        println(message)
    }
}

fun main()
{
    val message = test1()
    message.test2()
}
