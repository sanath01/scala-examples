package recurssion

/**
  * Created by muppallav on 3/3/16.
  */
object PascalTriangle {

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {

    def sum(a: Int, b: Int): Int = a + b

    if (c == 0 && r == 0)
      1
    else if (c == r)
      1
    else if (c == 0)
      1
    else
      sum(pascal(c, r - 1), pascal(c - 1, r - 1))
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def isClosed(counter: Int, remaining: List[Char]): Boolean = {
      var currCount: Int = counter
      if (remaining.isEmpty || counter < 0)
        false
      else if (counter == 0)
        true
      else {
        if (remaining.head == ')')
          currCount -= 1
        else if (remaining.head == '(')
          currCount += 1
        isClosed(currCount, remaining.tail)
      }
    }
    if (chars.isEmpty)
      true
    else if (chars.head == '(')
      isClosed(1, chars.tail)
    else if (chars.head == ')')
      false
    else
      balance(chars.tail)
  }

  /**
    * Write a recursive function that counts how many different ways you can make change for an amount,
    * given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have
    * coins with denomiation 1 and 2: 1+1+1+1, 1+1+2, 2+2.

    * Do this exercise by implementing the countChange function in Main.scala.
    * This function takes an amount to change, and a list of unique denominations for the coins. Its signature is as follows:

    * def countChange(money: Int, coins: List[Int]): Int

    * Once again, you can make use of functions isEmpty, head and tail on the list of integers coins.

    * Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF?
    * How many ways can you give change for >0 CHF, if you have no coins?
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    var numWays = 0
    numWays

  }

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(balance("(if (zero? x) max (/ 1 x))".toList))
  }
}
