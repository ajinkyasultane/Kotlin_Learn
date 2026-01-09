fun main()
{
    val list = mutableListOf(21,32,54,76,4,7,43)

    println(list)
    list.sort()
    println(list)
    list.add(12)
    println(list)
    list.remove(32)
    println(list)
    list.removeAt(3)
    println(list)

   // list()
    listreverse()
}

fun list()
{
    val list = mutableListOf<Int>()
    println("Enter the 5 numbers to see in the list")
    for (i in 1..5)
    {
        val x = readLine()?.toInt()
        if(x != null)
        {
            list.add(x)
        }
    }
    println(list)
}

fun listreverse()
{
    val list = mutableListOf<Int>()
    println("Enter the 5 number")
    for(i in 5 downTo   1)
    {
        val x = readLine()?.toInt()
        if(x != null)
        {
            list.add(x)
        }
    }
    println(list)
}


