//Constructors
//Primary Constructors - class Student(var a, var b)
//Secondary Constructors -
class Person{
    var name: String
    var age: Int

    constructor(x: String, y: Int) {
        this.name = x
        this.age = y
    }

    constructor(x: String){
        this.name  = x
        this.age = 0
    }
    constructor(){
        this.name = "Rahul"
        this.age = 32
    }

    fun intro()
    {
        println("my name is $name and age is $age")
    }
}

fun main()
{
    var a = Person("Riya", 22)
    a.intro()
    var b = Person()
    b.intro()
    var c = Person("Heena")
    c.intro()
}

-----------------------------------------------------

class Person(var name: String, var age: Int){
    constructor(x: String) : this() {
        this.name = x
        this.age = 0
    }

    constructor() : this("rahul", 50)

    fun intro()
    {
        println("my name is $name and age is $age")
    }
}

fun main()
{
    var a = Person("Riya", 22)
    a.intro()
    var b = Person()
    b.intro()
    var c = Person("Heena")
    c.intro()
}

-------------------------------------------------

import java.awt.Rectangle
//Inheritance
//Parent class - Base class
//Child class - Derived class
//open - inorder to inherit the open class
open class Rectangle(val a: Double, val b: Double){
    fun area(): Double {
        return a * b
    }
    open fun display(){
        println("Area of rectangle with dimensions $a & $b is ${area()}")
    }
}
class Square(side: Double): Rectangle(side, side){
    override fun display(){
        printlm("area of square with side $a is ${area()}")
    }
}

fun main(){
    val myRectangle = Rectangle(4.0, 5.0) 
    myRectangle.display()
    val mySquare = Square(4.0)
    mySquare.display()
}
