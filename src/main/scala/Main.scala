import scala.io.StdIn._

object Main extends App {
  def greet(name: String, age: Int) = s"Hi, my name is $name and I am $age years old."
  println(greet("Vadim", 15))

  def factorial(number: Int): Int = {
    if (number > 1) number * factorial(number - 1) else 1
  }
  println(factorial(0))

  def fibo(number: Int): Int = {
    if (number > 2) fibo(number - 1) + fibo(number - 2) else 1
  }
  println(fibo(5))

  def isPrime(number: Int, del: Int = 2): Boolean = {
    if (number < 2) return false
    if (number == 2) return true
    if (number % del == 0) return false
    if (del < number / 2) isPrime(number, del + 1)
    true
  }
  println(isPrime(67))
}
