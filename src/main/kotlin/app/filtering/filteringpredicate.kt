package app.filtering

fun main() {

    /**
     * Filtering by Predicate
     * ● Filtering adalah salah satu operasi collection yang sangat popular
     * ● Di kotlin, filtering bisa menggunakan predicate berupa lambda yang berisi kondisi filter nya
     * ● Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang
     *
     * Filtering by Predicate Operation
     * Filtering Operation                      Keterangan
     * filter((T) -> Boolean)                   Melakukan filtering terhadap collection
     * filterIndexed((index, T) -> Boolean)     Melakukan filtering terhadap collection, dengan tambahan informasi index
     * filterNot((T) -> Boolean)                Kebalikan dari filter((T) -> Boolean)
     * filterIsInstance<T>()                    Mengambil hanya data instant dari T
     * filterNotNull()                          Mengambil hanya data yang tidak null
     */

    val list = listOf("budhi", "oct", "22")
    val filter1 = list.filter { it.length > 5 } // Melakukan filtering terhadap collection
    val filterIndexed = list.filterIndexed { index, value -> index % 2 == 0 } // Melakukan filtering terhadap collection, dengan tambahan informasi index

    val list2 = listOf(null, 1, "budhi", 2, null)
    val filterIsInstance = list2.filterIsInstance<String>() // Mengambil hanya data instant dari T
    val filterNotNull = list2.filterNotNull() // Mengambil hanya data yang tidak null

    println(list) // [budhi, oct, 22]
    println(filter1) //  // []
    println(filterIndexed) // [budhi, 22]
    println(list2) // [null, 1, budhi, 2, null]
    println(filterIsInstance) // [budhi]
    println(filterNotNull) // [1, budhi, 2]


}