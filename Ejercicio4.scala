import scala.annotation.tailrec
object Ejercicio4{
    @tailrec
    def contarDigito(n: Int, dig: Int, acc: Int = 0): Int = {
        if n < 10 then {
            if n == dig then acc + 1
            else acc
        }
        else contarDigito(n/10, dig, if n%10 == dig then acc + 1 else acc)
    }

    def main(args: Array[String]): Unit = {
        println(contarDigito(525235, 5))
        println(contarDigito(11111, 1))
        println(contarDigito(987654, 3))
        println(contarDigito(707070, 0))
        println(contarDigito(113355, 3))
    }
}