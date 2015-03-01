package week1

/**
 * Created by Bindia Mukil on 3/1/2015.
 */
object exercise1 extends scala.App{

  def factorial(n: Int): Int={

    def loop (acc:Int, n:Int): Int ={
      if (n==0) return acc else loop(acc*n,n-1)
    }

    return loop(1,n)
  }

  println(factorial(5))
}