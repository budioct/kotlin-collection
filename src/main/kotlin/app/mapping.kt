package app

/**
 * Transformations : Mapping
 * ● Transformasi mapping digunakan untuk mengubah data ke data lain.
 * ● Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan
 *   collection hasil result lambda nya
 * ● Urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya.
 *
 * Transformations : Mapping Operations
 * Mapping Operations                                   Keterangan
 * map(transform: (T) -> R)                             Mengubah collection menjadi collection baru sesuai lambda transform
 * mapIndexed(transform: (index, T) -> R)               Mengubah collection menjadi collection baru, dengan tambahan parameter index
 * mapNotNull(transform : (T) -> R)                     Sama seperti map(), namun menghiraukan hasil null
 * mapIndexedNotNull( transform : (index, T) -> R)      Sama seperti mapIndexed(), namun menghiraukan nilai null
 *
 * Mapping Operations untuk Map
 * Mapping Operations                                Keterangan
 * mapKeys(transform: (Entry<K,V>) -> R)             Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform
 * mapValues(transform: (Entry<K,V>) -> R)           Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform
 */

fun main() {

    // transform collection
    val list: List<String> = listOf("budhi", "oct", "22")
    val list2: List<String> =
        list.map { item -> item.toUpperCase() } // map(transform: (T) -> R) // collection baru sesuai lambda transform
    val list3: List<Int> = list.map { item -> item.length }
    val list4: List<String> = list.mapNotNull { value ->
        if (value == "budhi") {
            value
        } else {
            null
        }
    } // mapNotNull(transform : (T) -> R) // menghiraukan hasil null transform


    list.forEach { data -> println("loop1: $data") }
    list2.forEach { data -> println("loop2: $data") }
    list3.forEach { data -> println("loop3: $data") }
    list.forEachIndexed { index, value -> println("loop4: $index = $value") } // mapIndexed(transform: (index, T) -> R) // collection baru dengan tambahan index transform
    list4.forEach { data -> println("loop5: $data") }

    println("\n")

    // transform Map
    val map: Map<Int, String> = mapOf(
        1 to "budhi",
        2 to "oct",
        3 to "22",
    )

    // keyword it = this.. access object
    val map1: Map<Int, String> = map.mapKeys { it.key * 10 } // mapKeys(transform: (Entry<K,V>) -> R) // transform key
    val map2: Map<Int, String> = map.mapValues { it.value.toUpperCase() } // mapValues(transform: (Entry<K,V>) -> R) // transform value

    map1.forEach { data -> println(data) }
    map2.forEach { data -> println(data) }


}