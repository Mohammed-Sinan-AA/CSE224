fun main()
{
    val a = 10
    val b = 20
    val result = "Sum of $a and $b is ${a+b}"
    println(result)
}

-----------------------------

fun main()
{
    val letter: Char
    letter = 'A'
    print("$letter")
    print('\n')
    print('\$')
    print('\\')
    
}

-------------------------

fun main()
{
    print("""
    Sinan
    	Sinan
    		Sinan
    			Sinan
    				Sinan""")
}

-------------------------

fun main()
{
    print("""
    	Sinan
    Sinan	Sinan
    	Sinan""")
}

------------------------

fun main()
{
    print("\tSinan\nSinan\t\tSinan\n\tSinan")
}
-----------------------

fun main()
{
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val words: Array<String> = arrayOf("Kotlin")
    val squares = Array(5){ i -> i * i}
    print(squares)
}

--------------------------
