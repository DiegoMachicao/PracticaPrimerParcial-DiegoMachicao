import scala.annotation.tailrec
object Ejercicio1{
    @tailrec
    def potencia(base: Int, exp: Int, acc: Long = 1): Long = {
        if exp == 0 then acc
        else potencia(base, exp - 1, acc * base)
    }

    @tailrec
    def decimalABinario(n: Int, acc: Long = 0, aux: Int = 0): Long = {
        if n <= 1 then acc + n * potencia(10, aux)
        else decimalABinario(n/2, acc + (n%2) * potencia(10, aux), aux + 1)
    }

    def main(args: Array[String]): Unit = {
        println(decimalABinario(1))
        println(decimalABinario(2))
        println(decimalABinario(5))
        println(decimalABinario(10))
        println(decimalABinario(25))
        println(decimalABinario(42))
        println(decimalABinario(1002))
    }
}