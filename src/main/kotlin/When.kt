import java.util.Locale
import java.util.Locale.getDefault

fun main()
{
    var i = 0;
    while(i != 4) {
        println("Enter your age : ")

        val age = readLine()?.toInt()

//    if(age in 0..5)
//    {
//        println("you're a young kid")
//    }
//    else if(age ==18)
//    {
//        println("you're a 18 year old and you are able to do voting")
//    }
//    else if(age ==19 || age == 20)
//    {
//        println("you're an adult")
//    }
//    else if(age in 21..65)
//    {
//        println("you're working professional")
//    }
//    else
//    {
//        println("you're reallu old")
//    }
        when (age) {

            in 0..5 -> println("you're a young kid")
            in 6..17 -> println("you're a teenager")
            18 -> println("you're able to do voting")
            in 21..65 -> println("you're a working professional")
            else -> println("you're a really older")
        }
        i++
    }
    assigment()

}

fun assigment()
{
 var i = 0;
    while(i != 4)
    {
        println("Enter your country name")
        val country = readLine()?.toString()

        when(country?.lowercase(getDefault()))
        {
             "india" ->println("Namaste")
            "russai"->println("Russian")
                "usa"-> println("Hello")
            else ->println("Unknown")
        }
        i++

    }
}