package app

fun main() {

    /**
     * Sequence
     * ● Selain List, Set dan Map, di Kotlin juga terdapat collection yang bernama Sequence
     * ● Sequence sekilas sama dengan collection lain, namun berbeda cara kerjanya ketika kita menambahkan banyak operasi ke sequence
     * ● Collection lain, ketika kita menambahkan beberapa operasi, semua akan dieksekusi secara eager. Setiap proses akan mengembalikan collection baru.
     * ● Berbeda dengan sequence, sequence mengeksekusi semua operasi secara lazy. Hanya akan dieksekusi ketika dibutuhkan
     *
     * Kapan Menggunakan Sequence?
     *   Gunakan ketika :
     *      ● Data collection besar
     *      ● Operasi collection kompleks dan banyak
     *
     *   Jangan gunakan ketika :
     *      ● Data collection tidak terlalu besar, karena ada overhead lazy object di Sequence
     *      ● Operasi yang dilakukan sederhana
     *
     */

    // BUKAN SEQUENCE
    val words = "the quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words
        .filter { println("filter $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println(words)
    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)

    println("\n")

    // SEQUENCE
    val wordsSequence: Sequence<String> = words.asSequence()
    val lengthsSequence = wordsSequence
        .filter { println("filter $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println(wordsSequence)
    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsSequence.toList())

}