
fun main() {
    val nombre = "Dani"
    var edad = 28
    saludar(nombre, edad)
}

fun saludar(nombre: String, edad: Int) {
    println("Hola, mi nombre es $nombre y tengo $edad años")

    // Si necesitas incluir el nombre de la variable en la cadena sin que se evalúe su valor,
    // puedes escapar el String Template utilizando el carácter de barra invertida (\):
    println("Hola, mi nombre es \$nombre y tengo $edad años")

}




