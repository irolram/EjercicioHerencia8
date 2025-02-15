class Estudiante(val carrera: String, val curso: String, val calificacionPromedio: Double, nombre: String, edad: Int): Persona(nombre, edad) {

    override fun mostrarRol() {
        println("Nombre: $nombre, Rol: Estudiante, edad: ${mostrarEdad()}")
    }
    fun mostrarCalificacion(){
        println(calificacionPromedio)
    }


}