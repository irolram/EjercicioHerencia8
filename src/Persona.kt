open class Persona(val nombre: String, var edad: Int = 0){

    init {
        require (edad < 0){ "No se admiten edades negativas" }
        require(!nombre.isEmpty()) { "El nombre no puede estar vacio" }
    }

    open fun mostrarRol(){
        println(nombre)
    }
    open fun cumple(){
        edad++
    }
    open fun mostrarEdad(): Int{
        return edad
    }
    open fun actividad(){
        println()
    }

}
