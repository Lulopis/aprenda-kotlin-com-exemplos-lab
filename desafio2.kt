// Enumerando níveis//
enum class Nível {
    Básico, Intermediário, Avançado                         
}

fun main() {
    val nível = Nível.Básico                       
    val message = when (nível) {                      
        Nível.Básico -> "Básico"
        Nível.Avançado -> "Avançado"
        Nível.Intermediário -> "Intermediário"
    }
    println(message)
}
