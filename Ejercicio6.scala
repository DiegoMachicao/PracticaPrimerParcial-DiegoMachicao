import scala.annotation.tailrec
object Ejercicio6{
    @tailrec
    def sumarDigitosPares(n: Int, acc: Int = 0): Int = {
        if n < 10 then {
            if n%2 == 0 then acc + n
            else acc
        }
        else sumarDigitosPares(n/10, if n%2 == 0 then acc + n%10 else acc)
    }

    def main(args: Array[String]): Unit = {
        println(sumarDigitosPares(583246))
        println(sumarDigitosPares(13579))
        println(sumarDigitosPares(2468))
        println(sumarDigitosPares(102030))
        println(sumarDigitosPares(8))
        println(sumarDigitosPares(2309))
    }
}