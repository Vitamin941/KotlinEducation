import java.lang.NumberFormatException
import java.util.Scanner

const val NUMS = "1234567890"
const val LETTERS_LOWER = "qwertyuiopasdfghjklzxcvbnm"
const val LETTERS_UPPER = "QWERTYUIOPASDFGHJKLZXCVBNM"
const val SYMBOLS = "<>,.?/:;[{}]_-+=()*&^%$$#@!~`"
const val ACCEPTED_SYMBOLS = LETTERS_UPPER + SYMBOLS + NUMS + LETTERS_LOWER

fun main(args: Array<String>) {
    var passwordLength:Int;
    if (args.isEmpty())
        with(Scanner(System.`in`)) {
            passwordLength = nextInt();
        }
    else {
        try {
            passwordLength = args[0].toInt();
        }
        catch (ex: NumberFormatException) {
            println("Argument isn't correct. Password length is defined as 20")
            passwordLength = 20
        }
    }
    println(createPassword(passwordLength))
}

fun createPassword (length: Int): String {
    var result:String = "";
    for (i in 0..length)
        result += ACCEPTED_SYMBOLS[(0..length).random()];
    return result;
}
