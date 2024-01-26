package app.transform

fun main() {

    /**
     * Transformations : String Representation
     * ● String Representations adalah operasi transformasi untuk mengubah collection menjadi string
     *
     * String Representation Operation
     * String Representation Operation                              Keterangan
     * joinToString(separator, prefix, suffix)                      Mengubah collection menjadi string dengan separator, prefix dan suffix
     * joinToString(separator, prefix, suffix, transform)           Mengubah collection menjadi string dengan separator, prefix dan suffix, namun akan diubah dalam transform terlebih dahulu
     * joinTo(Appendable, separator, prefix, suffix, transform)     Sama seperti joinToString, namun string ditambahkan ke Appendable
     *
     */

val list: List<String> = listOf("budhi", "oct", "22")
    println(list) // [budhi, oct, 22]
    println(list.joinToString(" ", "|", "|")) // |budhi oct 22|
    println(list.joinToString(", ", "{", "}") { value -> "Item=$value" } ) // {Item=budhi, Item=oct, Item=22}




}