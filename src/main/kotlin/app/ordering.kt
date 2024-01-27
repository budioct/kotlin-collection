package app

fun main() {

    /**
     * Ordering : Natural
     * ● Mengurutkan data sudah menjadi salah satu kebiasaan yang kita lakukan saat membuat program
     * ● Kotlin mendukung operasi untuk mengurutkan collection
     * ● Pada materi Kotlin Generic kita sudah belajar tentang interface Comparable, yaitu interface yang
     *    digunakan untuk melakukan perbandingan dua buat object, yang biasanya digunakan untuk mengurutkan data
     * ● Secara default tipe data yang ada di kotlin sudah memiliki Comparable (seperti Number, Char atau
     *    String). Oleh karena itu kita tidak perlu lagi membuat Comparable sendiri untuk mengurutkan data tersebut
     *
     * Ordering : Natural Operator
     * Ordering Natural Operator         Keterangan
     * sorted()                          Mengurutkan collection secara ascending
     * sortedDescending()                Mengurutkan collection secara descending
     */

    val list = listOf(1, 45, 67, 32, 90, 87, 53, 123, 45, 72, 45, 12)

    println("length: ${list.size}")
    println("sorted ascending: ${list.sorted()}")
    println("sorted descending: ${list.sortedDescending()}")

}