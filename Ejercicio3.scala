import scala.annotation.tailrec
object Ejercicio3{
    @tailrec
    def contarDigitosPares(n: Int, acc: Int = 0): Int = {
        if n < 10  then {
            if n%2 == 0 then acc + 1
            else acc
        }
        else contarDigitosPares(n/10, if n%2 == 0 then acc + 1 else acc)
    }

    def main(args: Array[String]): Unit = {
        println(contarDigitosPares(583246))
        println(contarDigitosPares(13579))
        println(contarDigitosPares(2468))
        println(contarDigitosPares(102030))
        println(contarDigitosPares(7))
        println(contarDigitosPares(222222))
    }
}