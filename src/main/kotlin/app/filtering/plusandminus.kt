package app.filtering

fun main() {

    /**
     * Plus & Minus Operators
     * ● Di kotlin, ada operator extension function plus dan minus untuk collection
     * ● Parameter pertama adalah collection, dan parameter selanjutnya bisa collection atau element, dan akan menghasilkan collection baru
     *
     * Plus & Minus Operators
     * Plus & Minus Operators       Keterangan
     * plus(element)                Membuat collection baru dengan menambahkan element
     * plus(collection)             Membuat collection baru dengan menambahkan collection
     * minus(element)               Membuat collection baru dengan menghapus element
     * minus(collection)            Membuat collection baru dengan menghapus collection
     *
     */

    // operator +
    val list1 = listOf("budhi", "oct", "22")
    val list2 = list1 + "adam"
    val list3 = list1 + listOf("imama", "firman", "atep")
    println(list1) // [budhi, oct, 22]
    println(list2) // [budhi, oct, 22, adam]
    println(list3) // [budhi, oct, 22, imama, firman, atep]

    // operator -
    val list4 = list1 - "22"
    val list5 = list1 - listOf("22", "oct")
    println(list4) // [budhi, oct]
    println(list5) // [budhi]

    val map1 = mapOf(
        "a" to "budhi",
        "b" to "oct",
        "c" to "22",
    )
    val map2 = map1 + ("d" to "husein") // // + (key to value)
    val map3 = map1 - "a" // - "key"
    println(map1) // a=budhi, b=oct, c=22}
    println(map2) // {a=budhi, b=oct, c=22, d=husein}
    println(map3) // {b=oct, c=22}


}