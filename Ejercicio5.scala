import scala.annotation.tailrec
object Ejercicio5{

    @tailrec
    def invertir(pal: String, acc: String = ""): String = {
        if pal == "" then acc
        else invertir(pal.init, acc + pal.last)
    }

    @tailrec
    def extraerPares(n: Int, acc: String = ""): String = {
        if n < 10 then {
            if n % 2 == 0 then invertir(acc + n)
            else invertir(acc)
        }
        else extraerPares(n/10, if n%2 == 0 then acc + n%10 else acc)
    }
    def main(args: Array [String]): Unit = {
        println(extraerPares(583246))
        println(extraerPares(13579))
        println(extraerPares(2468))
        println(extraerPares(102034))
        println(extraerPares(908172)) //El ejemplo que aparece en la instrucción de la práctica está mal, aparece el nueve aunque este sea impar
        println(extraerPares(1234567890))

    }
}