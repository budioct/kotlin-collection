package app

fun main() {

    /**
     * List Specific Operation
     * ● Di kotlin ada banyak operasi yang khusus dibuat untuk List
     *
     * List Specific Operator (1)
     * List Specific Operator                   Keterangan
     * getOrElse(index, (index) -> T)           Mengambil element di index, jika tidak ada, mengembalikan nilai lambda
     * getOrNull(index)                         Mengambil element di index, jika tidak ada, mengembalikan null
     * subList(from, to)                        Mengambil semua element dari from (inclusive) ke to (exclusive)
     * binarySearch(value)                      Melakukan pencarian menggunakan algoritma binary search
     *
     * List Specific Operator (2)
     * List Specific Operator               Keterangan
     * indexOf(value)                       Mengambil index element yang sama dengan value
     * lastIndexOf(value)                   Mengambil index element terakhir yang sama dengan value
     * indexOfFirst((T) -> Boolean)         Mengambil index element yang sama dengan kondisi
     * indexOfLast((T) -> Boolean)          Mengambil index element terakhir yang sama dengan kondisi
     */

    val list = listOf("budhi", "oct", "malik", "jamal", "husein")
    println("list: $list")
    println(list.getOrNull(1))
    println(list.getOrElse(5) { it -> "ups melebihi index" })
    println(list.subList(0, 2)) // [budhi, oct]

    val sorted = list.sorted()
    println("sorted: $sorted")
    println(sorted.binarySearch("jamal")) // 2 hasil index

    val numbers = listOf(1, 2, 3, 4, 5, 6, 4, 3, 1, 2, 3, 4, 5, 7, 4, 1, 2, 3, 9,)
    println("numbers: $numbers")
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { value -> value > 3 })


}