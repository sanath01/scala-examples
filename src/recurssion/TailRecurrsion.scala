package recurssion

/**
  * Created by muppallav on 3/3/16.
  */
object TailRecurrsion {

  def main(args: Array[String]) {
    println(factorial(4))
  }

  /**
    *
    */
  private def factorial(x: Int): Int = {
    def loop(acc: Int, x: Int): Int =
      if (x == 0)
        acc
      else
        loop(acc * x, x - 1)

    loop(1, x)
  }

}
