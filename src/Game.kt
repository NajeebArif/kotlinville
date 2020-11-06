fun max(num1:Int, num2:Int): Int {
    return if (num1>num2) num1 else num2
}

fun main() {
    val options:Array<String> = arrayOf("Rock", "Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice,gameChoice)
}
fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice){
        print("Please enter one of the following:")
        for(item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if(userInput!=null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        if(!isValidChoice) println("Please enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    if(userChoice == gameChoice) result =  "Tie!"
    else if(
            (userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")
    ) result = "You Win!"
    else result = "You Loose!"
    println("You chose $userChoice, I chose $gameChoice. $result")
}