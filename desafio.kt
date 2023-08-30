class usuário
class contato ( var id: String , var email: String)

fun main () {

var usuário = usuário ()
var contato = contato ("José" , "josé@gmail.com")
println (contato.id)
println (contato.email)
contato.id = "Marta"
println (contato.id)
contato.email = "marta@gmail.com"
println (contato.email)
contato.id = "Larissa"
println (contato.id)
contato.email = "larissa@gmail.com"
println (contato.email)

}


