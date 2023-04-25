import java.time.temporal.TemporalAmount

fun main() {
    var string = random("Aishah")
    println(random(string.length.toString()))
    println(random(string.first().toString()))
    println(random(string.last().toString()))
    var validPassword = word("jayden2016@ke")
    println(validPassword)



}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(name:String): String{
    val string = name
    return (string)
}
//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun word(password:String): String {
    var validPassword = password
    for (pass in validPassword) {
        if (validPassword.equals(password)) {
            return (true.toString())
        }
    }
    //3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
    fun mutiples() {
        var number = 1..1000
        for (num in number) {
            if (num % 2 == 0) {
                println("Bingo")
            }
        }
    }

    //    Create a class CurrentAccount with the following attributes: account number,
//    account name, balance. It has the following functions:
//    a. deposit(amount: Double) - Increments the balance by the amount
//            deposited
//    b. withdraw(amount: Double) - Decrements the balance by the amount
//            withdrawn
//    c. details() - Prints out the account number and balance and name in
//            this format: “Account number x with balance y is operated by z” (6pts)
    class currentAccount(var accountNumber: Int, var accountName: String, var balance: Int)

    fun deposit(amount: Double) {
        var money = amount
        ++money
        println(money)
    }
}







