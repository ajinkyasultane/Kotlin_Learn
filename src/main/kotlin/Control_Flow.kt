fun main()
{
    var active = true

    if (active == true)
    {
        println("the active is true")
    }
    else
    {
        println("The active is false")
    }

    val number = 100
    if (number != 100)
    {
        println("They are not equal")
    }
    else if (number <= 150)
    {
        println("Number are less than or eqaul to 150")
    }
    else
    {
        println("All the condition fals")
    }

    val score = 100;

    if (active && score == 120)
    {
        println("You are the next level")
    }
    else if (active && score == 100)
    {
        println("You are the same level")
    }
    else
    {
        println("you are fail")
    }
}