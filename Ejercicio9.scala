import scala.annotation.tailrec
object Ejercicio9{
    def max(a: Int, b: Int): Int = {
        if a > b then a
        else b
    }

    def min(a: Int, b: Int): Int = {
        if a < b then a
        else b
    }

    @tailrec
    def segundoMayorDigito(n: Int, may: Int= -1, seg: Int= -1): Int = {
        if n < 10 then min(if n != may then max(n, seg) else seg, may)
        else if n%10 == (n/10)%10 then segundoMayorDigito(n/10, may, seg)
        else segundoMayorDigito(n/10, max(may, n%10), min(max(n%10, seg), may))
    }

    def main(args: Array[String]): Unit = {
        println(segundoMayorDigito(58329))
        println(segundoMayorDigito(7416))
        println(segundoMayorDigito(9995))
        println(segundoMayorDigito(777))
        println(segundoMayorDigito(908090))
        println(segundoMayorDigito(2000002))
    }
}