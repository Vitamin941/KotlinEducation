package someGitStaff

private val guessedNumber = (1..100).random()
private var chances = 7

fun main() {
    while (chances > 0) {
        val numberRead = readLine()?.toIntOrNull()
        var numberGuessed  = guess(numberRead)
        if (numberGuessed == 0) {
            println("You guess the number!")
            break;
        }
        else if (numberGuessed > 0)
            println("$numberRead is smaller")
        else
            println("$numberRead is bigger")
        chances--;
    }
}

fun guess(userNumber: Int?) : Int {
    if (userNumber == null) {
        return TODO("Don't cool at the null safety for now");
    }
    return guessedNumber - userNumber
}