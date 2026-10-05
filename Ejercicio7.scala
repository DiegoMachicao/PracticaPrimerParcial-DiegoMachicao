import scala.annotation.tailrec
object Ejercicio7{
    @tailrec
    def contarMayusculas(pal: String, acc: Int = 0): Int = {
        if pal == "" then acc
        else contarMayusculas(pal.tail, if "ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(pal.head) then acc + 1 else acc)
    }

    def main(args: Array[String]): Unit = {
        println(contarMayusculas("HolaMundoScala"))
        println(contarMayusculas("SCALA"))
        println(contarMayusculas("programacion"))
        println(contarMayusculas("Scala3EsGenial"))
        println(contarMayusculas(""))
        println(contarMayusculas("MUCHASmayusculaS"))
    }
}