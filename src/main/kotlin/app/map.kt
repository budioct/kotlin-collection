package app

fun main() {

    // map tidak boleh duplikat / sama seperti set
    val map: Map<String, String> = mapOf(
        "budhi" to "Budhi",
        "oct" to "Oct",
        "22" to "22",
        "22" to "22",
    )
    println(map.size)
    println(map.isEmpty())
    println(map.isNotEmpty())
    println(map["budhi"]) // akses key, get value
    println(map["oct"])
    println(map["22"])
    for (entry in map) { println("loop 1 key: ${entry.key}, value: ${entry.value}") }

    println("\nmutable map")

    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap["a"] = "budhi"
    mutableMap["b"] = "oct"
    mutableMap["c"] = "22"
    for (entry in mutableMap) { println("loop 2 key: ${entry.key}, value: ${entry.value}") }


    val mutablemap2: MutableMap<String, String> = mutableMapOf(
        "d" to "arhan",
        "e" to "jodi",
        "f" to "hubner",
    )
    for (entry in mutablemap2) { println("loop 3 key: ${entry.key}, value: ${entry.value}") }




}