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

}