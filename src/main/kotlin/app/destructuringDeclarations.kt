package app

fun main() {
    /**
     * Destructuring Declarations di Map
     * ● Sebelumnya kita telah belajar destructuring declaration
     * ● Map menyimpan datanya dalam Entry<K,V>, dimana Entry memiliki function component1() untuk mendapatkan Key, dan component2() untuk mendapatkan Value
     * ● Hal ini jadi memungkinkan kita melakukan desctructuring di Entry Map
     *   contoh nya Destructuring (k, v) dari object Map<K, V>
     */

    val map = mapOf(
        "a" to "budhi",
        "b" to "oct",
        "c" to "jamal",
        "d" to "husein",
        "e" to "abdul",
    )

    for ((key, value) in map) {
        println("key: $key, value: $value")
    }

    map.forEach { (key, value) -> println("key: $key, value: $value") }

    map.forEach { entry -> println("key: ${entry.key}, value: ${entry.value}") }

}