fun main()
{
//    val arr = intArrayOf(12413,54533,45343,5453)
//val max = getmax(1,3,465,54,*arr,65,344,6575,34356,343,435,56,34,56,43,657,4,56)
//println(max)

//    searchfor("How to Improve ourself","Firefox")
//    searchfor("How to Develop Android Application")

    var sum = Alternatingsum(3,4,5,2,1,2,3)
    println("Alternating sum is $sum")
}


fun getmax(vararg number1:Int): Int{
    var max = number1[0]
    for(no  in number1)
    {
        if(no > max)
        {
            max = no
        }
    }
    return max
}
fun searchfor(search : String , searchengine: String = "Google")
{
    println("Searching for '$search' on $searchengine")
}

fun Alternatingsum(vararg numbers:Int):Int
{
    var sum = 0
    var toggle = true
    for (number in numbers)
    {
        if (toggle)
        {
            sum += number
        }
        else
        {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}