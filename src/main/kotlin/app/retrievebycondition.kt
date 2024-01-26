package app

fun main() {

    /**
     * Retrieve Single Elements by Condition
     * ● Selain mengambil satu element di collection berdasarkan posisi, kita juga bisa mengambil single element berdasarkan kondisi
     *
     * Retrieve Single Element by Position
     * Retrieve Single Element Operator             Keterangan
     * first((T) -> Boolean)                        Mengambil element pertama yang sesuai kondisi
     * last((T) -> Boolean)                         Mengambil element terakhir yang sesuai dengan kondisi
     * firstOrNull((T) -> Boolean) / find()         Mengambil element pertama yang sesuai kondisi, atau null jika tidak ada
     * lastOrNull((T) -> Boolean) / findLast()      Mengambil element terakhir yang sesuai kondisi, atau null jika tidak ada
     */

    val list = (1..20).toList()

    println(list.first { it > 10 })
    println(list.last { value -> value > 10})
    println(list.firstOrNull { it > 50 })
    println(list.lastOrNull { it > 50 })
    println(list.find { it > 50 })
    println(list.findLast { value -> value > 50 })
}