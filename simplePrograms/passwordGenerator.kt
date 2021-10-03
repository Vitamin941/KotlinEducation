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
        passwordLength = readLine()
            ?.first()!!.
            digitToInt()
    else
        passwordLength = parseArg(args[0])
    println(createPassword(passwordLength))
}

fun parseArg(arg: String): Int {
    var result:Int
    try {
        result = arg.toInt();
    }
    catch (ex: NumberFormatException) {
        println("Argument isn't correct. Password length is defined as 20")
        result = 20
    }
    return result
}

fun createPassword (length: Int): String {
    var result:String = "";
    for (i in 0..length)
        result += ACCEPTED_SYMBOLS[(0..length).random()]
    return result;
}
