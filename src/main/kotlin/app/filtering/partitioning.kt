package app.filtering

fun main() {

    /**
     * Filtering : Partitioning
     * ● Pada filtering by predicate, kita akan menghilangkan data yang tidak masuk kondisi filter
     * ● Dengan filtering partition, kita akan membagi collection menjadi dua, dimana collection pertama yang masuk filtering, dan collection kedua yang tidak masuk filtering
     *
     * Filtering : Partitioning Operation
     * Partitioning Operation Keterangan
     * partition((T) -> Boolean): Pair<List<T>, List<T>>    Mempartisi collection dengan filtering sehingga menghasilkan Pair collection T yang masuk filter, dan collection T yang tidak masuk filter
     */

    val list = listOf("budhi", "oct", "joko", "husein")
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(list) // [budhi, oct, joko, husein]
    println(listMatch) // [husein]
    println(listNotMatch) // [budhi, oct, joko]


}