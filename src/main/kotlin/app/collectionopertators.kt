package app

fun main() {

    /**
     * Jenis Operations
     * ● Transformations, melakukan transformasi terhadap collection
     * ● Filtering, melakukan filtering atau seleksi terhadap collection
     * ● plus and minus operators, operasi + dan - terhadap collection
     * ● Grouping, melakukan pemisahan dalam group terhadap collection
     * ● Retrieving collection parts, mengambil sebagian data di collection
     * ● Retrieving single elements, mengambil satu data di collection
     * ● Ordering, melakukan pengurutan data di collection
     * ● Aggregate operations, melakukan agregasi terhadap data yang ada di collection
     */

    listOf("budhi", "oct").forEach { value -> println(value)}
    listOf("budhi", "oct").forEachIndexed {index, value ->
        println("$index = $value")
    } // mapIndexed(transform: (index, T) -> R)

}