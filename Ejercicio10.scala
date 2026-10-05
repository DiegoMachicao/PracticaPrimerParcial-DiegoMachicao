object Ejercicio10{
    def rachaMaxima(pal: String, acc: Int = 0, cont: Int = 0): Int = {
        if pal == "" then 0
        else if pal.length <= 1 then {
            if cont > acc then cont + 1
            else acc + 1
        }
        else if pal.head == pal.tail.head then rachaMaxima(pal.tail, if cont > acc then cont else acc, cont + 1)
        else rachaMaxima(pal.tail, if cont > acc then cont else acc, 0) 
    }

    def main(args: Array[String]): Unit = {
        println(rachaMaxima("aaabbccccdaa"))
        println(rachaMaxima("aabbbbbcc"))
        println(rachaMaxima("abcde"))
        println(rachaMaxima("aaaaaa"))
        println(rachaMaxima("aabbbaaaa"))
        println(rachaMaxima(""))
        println(rachaMaxima("aaAAaa"))
        println(rachaMaxima("AaaAaaAAaaa"))
    }
}