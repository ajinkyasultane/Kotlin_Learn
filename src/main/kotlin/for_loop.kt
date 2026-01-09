fun main()
{
    var arr = arrayOf(1,2,3,4,5)
    for(i in arr)
    {
        println(i)


    }
//    maxvalueofarray()
//    reverseserial()
//    serial()

    arraysum()
}

fun serial()
{
    for (i in 1..10)
    {
        println(i)
    }
}

fun reverseserial()
{
    for(i in 5 downTo 1)
    {
        print(i)
    }
}

fun alphabets()
{
    for (i in 'a'..'z')
    {
        println(i)
    }
}

fun maxvalueofarray()
{
    val myarray = arrayOf(1,2,3,4,5, 23 , 54)
    var max = myarray[0]
    for (i in myarray)
    {
        if (i > max)
        {
            max = i
        }
    }
    println(max)
}

fun arraysum()
{
    var arr = arrayOf(21,12,34,54,32)
    var sum = 0
    for (i in arr)
    {
         sum += i
    }
    println(sum)
}
