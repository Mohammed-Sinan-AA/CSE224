fun main()
{
    var a = 10
    var b = 5
    //Arithemetic operation
    val sum = a+b
    println("Sum: $a + $b = $sum")
    println("Subtraction: $a - $b = ${a-b}")
    println("Multiplication: $a * $b = %{a*b}")
    println("Division: $a/$b = ${a/b}")
    println("Modulus: $a%$b = ${a%b}")
    //Relational Operators
    println("$a is greater than $b: ${a>b}")
    println("$a is less than $b: ${a<b}")
    println("$a is greater than or equal to $b: ${a>=b}")
    println("$a is less than or equal to $b: ${a<=b}")
    println("$a is equal to $b: ${a==b}")
    println("$a is not equal to $b: ${a!=b}")
    //Assignment Operators
    a+=b
    println("a+=b = $a")
    a-=b
    println("a-=b = $a")
    a*=b
    println("a*=b = $a")
    a/=b
    println("a/=b = $a")
    a%=b
    println("a%=b = $a")
    //Unary Operators
    a = 10
    println("Initial value: $a")
    println("Increment by 1: $++a")
    println("Decrement by 1: $--b")
    
}
