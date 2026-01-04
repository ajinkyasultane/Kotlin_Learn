fun main()
{
    var number1 = 10;
    var number2 = 21;

    val resultaddition = number1 + number2;
    val resultminus = number2 -number1
    val  resultmultiple = number1 * number2
    val resultdivision = number1 / number2
    val resultmodulos = number1 % number2
    println("The Addition of Two number is $resultaddition")
println("The substration of two number is $resultminus")
    println("Multiplication is $resultmultiple")
    println("Division is $resultdivision")
    println("Modulous is $resultmodulos")
    println("Number1++ = ${number1++}")
    println("++Number1 = ${++number1}")

    println("Number2--  = ${number2--}")
    println("---Number2  = ${--number2}")

    //Assigment operator

    number1 += 10;
    println(number1)

    number2 *= 20
    println(number2)
}
