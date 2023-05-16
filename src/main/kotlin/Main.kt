fun main(args: Array<String>) {
    val likes: Int = 61
    val people: String = "людям"
    val humans: String = "человеку"
    if (likes % 10 === 1 && likes % 100 != 11) println("Понравилось $likes $humans")
    else
        println("Понравилось $likes $people")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

}