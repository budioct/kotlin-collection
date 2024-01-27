package app

fun main() {

    /**
     * Retrieve Single Elements by Position
     * ● Di kotlin kita bisa mengambil satu element di collection menggunakan posisi
     *
     * Retrieve Single Element by Position
     * Retrieve Single Element Operator          Keterangan
     * elementAt(index)                          Mengambil element pada posisi index.
     * first()                                   Mengambil element pertama
     * last()                                    Mengambil element terakhir
     * elementAtOrNull(index)                    Mengambil element pada posisi index. Null jika tidak ada index
     * elementAtOrElse(index, defaultValue)      Mengambil element pada posisi index. Atau default value jika tidak ada index
     */

    val list = listOf("budhi", "oct", "jamal", "malik")
    println(list.first())
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrNull(10)) // jika tidak akan return null
    println(list.elementAtOrElse(10) { "hello world" }) // jika tidak ada akan return param defaul value


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

    val range = (1..20).toList()

    println(range.first { it > 10 })
    println(range.last { value -> value > 10 })
    println(range.firstOrNull { it > 50 })
    println(range.lastOrNull { it > 50 })
    println(range.find { it > 50 })
    println(range.findLast { value -> value > 50 })


    /**
     * Retrieve Single Element by Random
     * ● Kotlin juga mendukung operasi untuk mengambil element secara random di dalam collection
     *
     * Retrieve Single Element by Position
     * Retrieve Single Element Operator         Keterangan
     * random()                                 Mengambil element secara random
     */

    val range2 = (1..100).toList()
    println(range2.random())
    println(range2.random())
    println(range2.random())
    println(range2.random())
    println(range2.random())

}