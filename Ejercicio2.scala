import scala.annotation.tailrec
object Ejercicio2{
    def max(a: Int, b: Int): Int = {
        if a > b then a
        else b
    }

    @tailrec
    def digitoMayor(n: Int, acc: Int = 0): Int = {
        if n < 10 then max(n, acc)
        else digitoMayor(n/10, max(acc, n%10))
    }

    def main(args: Array[String]): Unit = {
        println(digitoMayor(58329))
        println(digitoMayor(4441))
        println(digitoMayor(123456))
        println(digitoMayor(80723))
        println(digitoMayor(5))
        println(digitoMayor(12340874))
    }
}