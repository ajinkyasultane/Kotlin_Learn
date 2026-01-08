fun main()
{
    println("Enter your age : ")
    val age = readLine()?.toInt()

    if (age != null) {
        if (age > 0 && age < 18) {
            println("you're not ault yet")
        } else if (age > 18 && age <= 65) {
            println("you're ault")
        } else {
            println("you are really really old age")
        }
    }
}