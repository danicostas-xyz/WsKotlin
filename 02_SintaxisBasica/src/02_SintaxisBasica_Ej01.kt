fun main(){
    var nombre:String? = "Dani"
    var edad = 28

    edad = 29

    println("Hola, mi nombre es $nombre y tengo $edad años.")

    nombre = null

    println("Bienvenido, ${nombre ?: "Nombre no proporcionado"}")
    // Si se va a usar una expresión como nombre ?: "Nombre no proporcionado, hay que meter la expresión
    // entre ${}
}

