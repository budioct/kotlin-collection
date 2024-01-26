package app

fun main() {

    /**
     * Transformations : Zipping
     * ● Zipping adalah transformasi yang digunakan untuk menggabungkan dua buah collection.
     *
     * Transformations : Zipping Operations
     * Mapping Operations Keterangan
     * zip(collection)                               Menggabungkan dua collection, sehingga menghasilkan Pair<T1, T2>
     * zip(collection, transform: (T1, T2) -> R)     Menggabungkan dua collection dengan lambda transform sehingga menghasilkan collection baru dari result lambda transform
     *
     * Transformations : Unzip Operations
     * Mapping Operations                            Keterangan
     * unzip() Mengubah collection Pair<T1, T2>      menjadi dua collection, collection T1 dan collection T2
     *
     */

    // zip
    val list1: List<String> = listOf("budhi","oct", "22")
    val list2: List<String> = listOf("samil","husein", "umar")

    val zip: List<Pair<String, String>> = list1.zip(list2) // zip(collection) // mengabungkan collection
    val zip1: List<String> = list1.zip(list2) { item1, item2 -> item1 + " " + item2} // zip(collection, transform: (T1, T2) -> R) // mengabungkan collection return collection baru dari result lambda transform

    println(zip) // [(budhi, samil), (oct, husein), (22, umar)]
    println(zip1) // [budhi samil, oct husein, 22 umar]

    // unZip
    val listBro: List<Pair<String, String>> = listOf(
        "budhi" to "ismail",
        "danang" to "umar",
        "joko" to "husein"
    )
    println(listBro) // [(budhi, ismail), (danang, umar), (joko, husein)]

    val unzip : Pair<List<String>, List<String>> = listBro.unzip()
    println(unzip) // ([budhi, danang, joko], [ismail, umar, husein])


}