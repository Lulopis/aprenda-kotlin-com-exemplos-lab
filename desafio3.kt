// Matricular usuario

val inscritos: MutableSet<String> = mutableSetOf("usuario1", "usuario2", "usuario3") 

fun addInscrito(usuario: String): Boolean {                                                       
    return inscritos.add(usuario)                                                            
}

fun getStatusLog(isAdded: Boolean): String {                                                       
    return if (isAdded) "matriculado corretamente." else "ja esta matriculado."          
}

fun main() {
    val aNewInscrito: String = "usuario4"
    

    println("Inscrito $aNewInscrito ${getStatusLog(addInscrito(aNewInscrito))}")                              
                  
}