fun main()
{

    try {
        var div = 20 / 0

        println(div)
    }
    catch (e: ArithmeticException) {
        println("Division by zero")
    }
    finally {
        println("Division by zero code is under exception")
    }
}