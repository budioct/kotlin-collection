package app

fun main() {

    /**
     * Properties di Map
     * ● Salah satu hal yang biasa dilakukan dalam membuat program adalah, menyimpan value properties di Map
     * ● Kadang ini dilakukan ketika parsing data JSON atau hal-hal dinamis lainnya.
     * ● Dalam keadaan seperti ini, kita bisa melakukan delegate properties di Map
     */

    val application = Application(
        mapOf(
            "name" to "budhi",
            "version" to 2
        )
    )
    println("name: ${application.name}")
    println("version: ${application.version}")

}

// pendekatan DTO yang bisa di lakukan di kotlin
class Application(map: Map<String, Any>) {

    val name: String by map
    val version: Int by map
}