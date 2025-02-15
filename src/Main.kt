//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val profesor1 = Profesor("Mates", 22.0, "Pedrito", 53)
    val estudiante1 = Estudiante("Filosofia","Ciencias", 8.5, "Juanito", 20)
    val persona1 = Persona("Aroa", 22)

    persona1.actividad()
    estudiante1.actividad()

    profesor1.mostrarRol()
    estudiante1.mostrarRol()

    profesor1.cumple()
    profesor1.mostrarRol()

}