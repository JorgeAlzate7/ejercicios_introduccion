package com.example.ejerciciosintroduccion

// Ejercicio 1: Clase Persona y metodo presentarse
/*class Persona(val nombre: String, val edad: Int) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años")
    }
}

// Ejercicio 2: Clase Automovil con constructor secundario
class Automovil(val marca: String, val modelo: String, val anio: Int) {
    // Constructor secundario con anio por defecto (2025)
    constructor(marca: String, modelo: String) : this(marca, modelo, 2025)
}
*/
// Ejercicio 3: Herencia y polimorfismo con clase Animal
/* open class Animal {
    open fun hacerSonido() {
        println("Sonido generico de animal")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("Miau")
    }
}*/

// Ejercicio 4: Data Class Libro
/* data class Libro(val titulo: String, val autor: String, val anio: Int)
*/
// Ejercicio 5: Interfaz Reproducible
/*interface Reproducible {
    fun play()
    fun pause()
}

class Cancion(val titulo: String) : Reproducible {
    override fun play() {
        println("Reproduciendo la cancion: $titulo")
    }

    override fun pause() {
        println("Pausando la cancion: $titulo")
    }
}

class Video(val titulo: String) : Reproducible {
    override fun play() {
        println("Reproduciendo el video: $titulo")
    }

    override fun pause() {
        println("Pausando el video: $titulo")
    }
}*/

// Ejercicio 6: Interfaz Generica Repositorio
/* interface Repositorio<T> {
    fun agregar(item: T)
    fun obtener(id: Int): T
    fun eliminar(id: Int)
    fun tamano(): Int
}

class RepositorioMemoria<T> : Repositorio<T> {
    private val elementos = mutableListOf<T>()

    override fun agregar(item: T) {
        elementos.add(item)
    }

    override fun obtener(id: Int): T {
        return elementos[id]
    }

    override fun eliminar(id: Int) {
        if (id in elementos.indices) {
            elementos.removeAt(id)
        }
    }

    override fun tamano(): Int {
        return elementos.size
    }
}
*/
// Ejercicio 7: Multiple implementacion de interfaces
/*interface Volador {
    fun volar()
}

interface Nadador {
    fun nadar()
}

class Pato : Volador, Nadador {
    override fun volar() {
        println("El pato esta volando")
    }

    override fun nadar() {
        println("El pato esta nadando en el agua")
    }
}*/

// Ejercicio 8: Enum DiaSemana
/* enum class DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}*/

// Ejercicio 9: Enum Moneda con atributo
/* enum class Moneda(val simbolo: String) {
    DOLAR("$"), EURO("€"), PESO("COP$")
}
*/
// Ejercicio 10: Enum Nivel con metodo comparador
/* enum class Nivel(val puntos: Int) {
    BAJO(10), MEDIO(50), ALTO(100);

    fun esMayorQue(nivel: Nivel): Boolean {
        return this.puntos > nivel.puntos
    }
}*/

fun main() {
  /*  println("--- EJERCICIO 1 ---")
    val persona = Persona("Ana", 25)
    persona.presentarse()*/
    // cree la clase persona con nombre y edad y luego llame el metodo para imprimir el saludo

/*    println("\n--- EJERCICIO 2 ---")
    val auto1 = Automovil("Toyota", "Corolla", 2022)
    val auto2 = Automovil("Mazda", "CX-30") // Usando constructor secundario
    println("Auto 1: ${auto1.marca} ${auto1.modelo} - Año: ${auto1.anio}")
    println("Auto 2: ${auto2.marca} ${auto2.modelo} - Año: ${auto2.anio}")
    // hice el constructor secundario para que ponga el ano 2025 por defecto si no le paso ese dato
*/
/*   println("\n--- EJERCICIO 3 ---")
    val animales: List<Animal> = listOf(Perro(), Gato(), Perro())
    for (animal in animales) {
        animal.hacerSonido()
    }*/
    // cree la lista con perros y gatos y la recorri con un for llamando el metodo hacer sonido

 /*   println("\n--- EJERCICIO 4 ---")
    val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)
    val libro2 = libro1.copy(anio = 2021)
    println("Libro original: $libro1")
    println("Libro copiado: $libro2")
    // use la funcion copy para duplicar el libro1 cambiando solo el ano e imprimi los data class que ya traen el tostring formateado

    println("\n--- EJERCICIO 5 ---")
    val listaReproducible: List<Reproducible> = listOf(
        Cancion("Bohemian Rhapsody"),
        Video("Tutorial Kotlin")
    )
    for (item in listaReproducible) {
        item.play()
        item.pause()
    }*/
    // implemente la interfaz en cancion y video y luego recorri la lista ejecutando play y pause en cada uno

  /*  println("\n--- EJERCICIO 6 ---")
    val repoString = RepositorioMemoria<String>()
    repoString.agregar("Hola")
    repoString.agregar("Mundo")
    println("Tamaño repo string: ${repoString.tamano()}")
    println("Elemento en indice 0: ${repoString.obtener(0)}")

    val repoLibro = RepositorioMemoria<Libro>()
    repoLibro.agregar(libro1)
    println("Tamaño repo libro: ${repoLibro.tamano()}")
    // cree la clase generica repositorio en memoria con una lista mutable y la probe con strings y con objetos libro

    println("\n--- EJERCICIO 7 ---")
    val pato = Pato()
    pato.volar()
    pato.nadar()*/
    // cree las dos interfaces y las implemente juntas en la clase pato probando que funcionen ambos metodos

 /*   println("\n--- EJERCICIO 8 ---")
    val numeroDia = 3 // Ejemplo de número recibido (del 1 al 7)
    if (numeroDia in 1..7) {
        val dia = DiaSemana.entries[numeroDia - 1]
        println("El día correspondiente al número $numeroDia es: $dia")
    } else {
        println("Número inválido")
    }*/
    // converti el numero del 1 al 7 para obtener la posicion correcta del enum e imprimir el dia

 /*   println("\n--- EJERCICIO 9 ---")
    for (moneda in Moneda.entries) {
        println("Moneda: ${moneda.name}, Símbolo: ${moneda.simbolo}")
    }*/
    // recorri todos los valores del enum moneda imprimiendo el nombre y el simbolo de cada una
/*
    println("\n--- EJERCICIO 10 ---")
    val nivelBajo = Nivel.BAJO
    val nivelAlto = Nivel.ALTO
    println("¿Nivel ALTO es mayor que BAJO?: ${nivelAlto.esMayorQue(nivelBajo)}")
    println("¿Nivel BAJO es mayor que ALTO?: ${nivelBajo.esMayorQue(nivelAlto)}")*/
    // cree el metodo es mayor que dentro del enum para comparar los puntos entre dos niveles y muestre si es true o false
}