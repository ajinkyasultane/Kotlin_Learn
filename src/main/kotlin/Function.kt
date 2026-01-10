fun main()
{
//    printhello()
//    power(10,4)
   var no1 = readLine()
    var no2 = readLine()

    assignment(1,5)
}
fun printhello()
{
    println("Print Hello Ajinkya")
}

fun power(base:Int , exponent: Int)
{
    var result =1
    for( i in 1..exponent)
    {
        result *= base
    }
    println(result)
}

fun assignment(num1: Int , num2 : Int)
{
    var sum = 0;
    for(i in num1 .. num2)
    {
        sum +=i
    }
    println(sum)
}