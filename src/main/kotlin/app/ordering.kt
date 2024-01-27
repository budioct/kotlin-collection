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


    /**
     * Ordering : Reverse
     * ● Di Kotlin, kita bisa mendapatkan collection dengan urutan data terbalik dari data aslinya
     *
     * Ordering : Reverse Operator
     * Ordering Reverse Operator        Keterangan
     * reversed()                       Membuat collection baru dengan urutan terbalik dari collection aslinya
     * asReversed()                     Membuat view terhadap collection dengan urutan terbalik, jika collection aslinya berubah, view pun akan ikut berubah
     */

    val names = mutableListOf("budhi", "oct", "husein", "malik", "ayman", "sodiq")
    val reversed = names.reversed()
    val asReversed = names.asReversed()

    names.addFirst("add on first")
    names.addLast("add on last")
    println(reversed) // [sodiq, ayman, malik, husein, oct, budhi]
    println(asReversed) // [add on last, sodiq, ayman, malik, husein, oct, budhi, add on first]


    /**
     * Ordering : Custom
     * ● Selain menggunakan comparable bawaan kotlin, kita juga bisa membuat comparable sendiri
     * ● Ini cocok untuk mengurutkan data yang kita buat sendiri
     *
     * Ordering : Custom Operator
     * Ordering Natural Operator                        Keterangan
     * sortedBy(selector: (T) -> R)                     Mengurutkan collection secara ascending menggunakan selector
     * sortedByDescending(selector: (T) -> R)           Mengurutkan collection secara descending menggunakan selector
     * sortedWith(Comparator<T>)                        Mengurutkan collection dengan Comparator<T>
     *
     */

    val fruits: List<Fruit> = listOf(Fruit("apple", 4), Fruit("manggo", 3))

    println(fruits.sortedBy { it.quantity }) // [Fruit(name=manggo, quantity=3), Fruit(name=apple, quantity=4)]
    println(fruits.sortedByDescending { it.quantity })
    println(fruits.sortedWith(compareBy { it.quantity })) // [Fruit(name=manggo, quantity=3), Fruit(name=apple, quantity=4)]
    println(fruits.sortedWith(compareByDescending { it.quantity }))
    println(fruits.sortedWith(Comparator { a, b -> a.quantity.compareTo(b.quantity) })) // [Fruit(name=manggo, quantity=3), Fruit(name=apple, quantity=4)]

}

data class Fruit(val name: String, val quantity: Int)



