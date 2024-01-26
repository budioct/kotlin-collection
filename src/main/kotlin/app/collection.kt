package app

fun <T> displayCollection(collection: Collection<T>){

    // Collection supertype of list<T>, set<T>

    for (item in collection) println(item)
}

fun <T> displayMutableCollection(collection: MutableCollection<T>){

    for (item in collection) println(item)
}

fun main() {

    // immutable collection
    displayCollection(listOf("budhi", "oct", "22"))
    displayCollection(setOf("sadam", "husein", "husein"))
    displayCollection(mapOf("a" to "budhi").entries) // entries wrapping Map<K,V> ke Set<Map<K,V>>
    // displayCollection(mapOf("b" to "aseek")) // Error, map bukan collection .. //eturns a new read-only map, mapping only the specified key to the specified value. The returned map is serializable.

    // mutable collection
    displayMutableCollection(mutableListOf("budhi", "oct", "22"))
    displayMutableCollection(mutableSetOf("sadam", "husein", "husein"))
    displayMutableCollection(mutableMapOf("a" to "budhi").entries) // entries wrapping Map<K,V> ke Set<Map<K,V>>

}