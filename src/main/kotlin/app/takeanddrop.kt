package app

fun main() {
    /**
     * Take & Drop Operators
     * ● Untuk mengambil sebagian element di collection, selain menggunakan slice, kita juga bisa menggunakan operator take dan drop
     *
     * Take Operators
     * Slice Operator                   Keterangan
     * take(n) Mengambil                collection diawal sejumlah n
     * takeLast(n)                      Mengambil collection diakhir sejumlah n
     * takeWhile((T) -> Boolean)        Mengambil element dari awal selama kondisi bernilai true, jika false, maka berhenti
     * takeWhileLast((T) -> Boolean)    Sama seperti takeWhile, namun dimulai dari element akhir
     *
     * Drop Operators
     * Slice Operator                   Keterangan
     * drop(n)                          Menghapus collection diawal sejumlah n
     * dropLast(n)                      Menghapus collection diakhir sejumlah n
     * dropWhile((T) -> Boolean)        Menghapus element dari awal selama kondisi bernilai true, jika false, maka berhenti
     * dropWhileLast((T) -> Boolean)    Sama seperti dropWhile, namun dimulai dari element akhir
     */

    val list = ('a'..'z').toList()

    // lambda jika tidak menggunakan keyword it
    // println(list.takeWhile { value -> value < 'n' }) // [a, b, c, d, e, f, g, h, i, j, k, l, m]

    // lambda dengan menggunakan keyword it
    println(list.take(3)) // [a, b, c]
    println(list.takeWhile { it < 'n' }) // [a, b, c, d, e, f, g, h, i, j, k, l, m]
    println(list.takeLast(2)) // [y, z]
    println(list.takeLastWhile { it > 'w' }) // [x, y, z]

    println(list.drop(23)) // [x, y, z]
    println(list.dropLast(23)) // [a, b, c]
    println(list.dropWhile { it < 't' }) // [t, u, v, w, x, y, z]
    println(list.dropLastWhile { it > 'c' }) // [a, b, c]

}