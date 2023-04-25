fun main() {
    var findWord = random("school")
    println(findWord[0])
    println(findWord[5])
    println( findWord.length)

    getMultiples()

    var getBalance = CurrentAccount(109356783,"James",2000.00)
    getBalance.deposit(500.0)
    getBalance.withdraw(1000.00)
    getBalance.details()

    var getWithdrawals =SavingAccount(107673667,"James",3000.0,2)
    println(getWithdrawals.withdraw())



}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun random(getWord:String):String{
    return getWord
}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun getPassword(password:String):Boolean{
//    for (words ifor (words in password){
        if (){

        }
    }n password){
//        if (){
//
//        }
//    }
    return true
}


//
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun getMultiples(){
    for (nums in 1..1000){
        if (nums %6 ==0 && nums %8 ==0){
            println("Bingo!")
        }
        else{
            println("Does not exit")
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
 open class CurrentAccount(var accountNumber:Int, var accountName:String, var balance:Double){
     fun deposit(amount:Double){
         var newBalance = balance + amount
         println(newBalance)
     }

    fun withdraw(amount: Double){
        var reduceBalance = balance -amount
        println(reduceBalance)

    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
 }

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal

class  SavingAccount(accountNumber:Int,  accountName:String,  balance:Double, var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    fun withdraw(){
        if ( withdrawals < 4){
            ++withdrawals
        }
    }

}