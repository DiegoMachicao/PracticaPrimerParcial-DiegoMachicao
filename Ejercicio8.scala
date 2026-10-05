object Ejercicio8{
    def contarCambiosParidad(n: Int, acc: Int = 0): Int = {
        if n < 100 then {
            if n%2 == (n/10)%2 then acc
            else acc + 1
        }
        else contarCambiosParidad(n/10, if n%2 == (n/10)%2 then acc else acc + 1)
    }

    def main(args: Array[String]): Unit = {
        println(contarCambiosParidad(123456))
        println(contarCambiosParidad(248135))
        println(contarCambiosParidad(2468))
        println(contarCambiosParidad(13579))
        println(contarCambiosParidad(52841))// En el ejemplo del enunciado está mal, marca que hay 3 cambios cuando en realidad solo hay 2, 5 -> 2 y 4 -> 1
        println(contarCambiosParidad(10101010))
    }
}