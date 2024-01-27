package app

fun main() {

    /**
     * Set Specific Operations
     * ● Di kotlin juga terdapat operations yang khusus digunakan untuk Set
     *
     * Set Specific Operator
     * Set Specific Operator        Keterangan
     * union(collection)            Mengembalikan semua element dari kedua set
     * intersect(collection)        Mengembalikan semua element yang terdapat di kedua set
     * substract(collection)        Mengembalikan semua element yang tidak dimiliki oleh set
     */

    val numbers1 = (1..10).toSet()
    val numbers2 = (6..15).toSet()

    println(numbers1 union numbers2) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    println(numbers1 intersect numbers2) // [6, 7, 8, 9, 10]
    println(numbers1 subtract numbers2) // [1, 2, 3, 4, 5]

}