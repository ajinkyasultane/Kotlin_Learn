fun main()
{
    var names = arrayOf("Ajinkya","Sham","Nivrutti","Datta","Krushna")
    var arraysize = names.size
    var i = 0
    while (i < arraysize)
    {
        println(names[i])
        i++
    }
    //number()
    power()
}

fun number()
{
    var number1: Int? = readLine()?.toInt()
  var i = 0;

    println("Enter the number you want to continue")

    while (number1 != null && number1 > i)
    {
        println(number1--)
    }
}


fun power()
{
    print("Enter a number 1:")
    var num1 = readLine()?.toInt()

    print("Enter a number 2:")
    var num2 = readLine()?.toInt()

    var result = 1
    var i =0

    while(num1 != null && num2  != null && i < num2 )
    {
        result *= num1
        i++
    }
    println(result)

}
