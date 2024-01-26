package app

fun main() {

    /**
     * Chunked Operator
     *  Chunked adalah operasi untuk memotong collection menjadi beberapa collection
     *
     *  Chunked Operator
     * Chunked Operator                         Keterangan
     * chunked(n) : List<List<T>>               Memotong collection menjadi beberapa collection dengan jumlah data n
     * chunked(n, (List<T>) -> R) : List<R>     Memotong collection menjadi beberapa collection dengan jumlah data n, lalu melakukan transformasi List<T> menjadi R, sehingga menghasilkan List<R>
     */

    val range = (1..100).toList()
    val list1 = range.chunked(10)
    var list2 = range.chunked(10) { list: List<Int> ->
        var total = 0
        for (number in list) {
            total += number
        }
        total
    }

    println("range: $range")
    println("list1: $list1")
    println("list2: $list2")

}