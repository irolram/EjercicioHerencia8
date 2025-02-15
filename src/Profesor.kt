class Profesor(val departamento : String, val aniosExperiencia: Double, nombre: String, edad: Int): Persona(nombre, edad) {

    override fun mostrarRol() {
        println("Nombre: $nombre, Rol: Profesor, edad: ${mostrarEdad()}")
    }
    fun mostrarExperiencia(){
        println("Años de experiencia: $aniosExperiencia")
    }
}