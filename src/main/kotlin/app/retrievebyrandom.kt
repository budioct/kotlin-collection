package app

fun main() {
    /**
     * Retrieve Single Element by Random
     * ● Kotlin juga mendukung operasi untuk mengambil element secara random di dalam collection
     *
     * Retrieve Single Element by Position
     * Retrieve Single Element Operator         Keterangan
     * random()                                 Mengambil element secara random
     */

    val list = (1..100).toList()
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())

}