package app.filtering

fun main() {

    /**
     * Fold & Reduce.. (lipat dan kecilkan)
     * ● Jika kita ingin membuat aggregate secara manual, kita bisa menggunakan operator fold dan reduce
     * ● Fold dan reduce merupakan operasi yang dilakukan pada element-element yang ada di collection secara iterasi sequential dan mengembalikan hasil.
     * ● Hasil dari fold dan reduce akan digunakan untuk iterasi selanjutnya.
     *
     * Fold & Reduce Operator (1)
     * Fold & Reduce Operator               Keterangan
     * reduce((R, T) -> R) : R              Pada iterasi pertama, R adalah element pertama, T adalah element selanjutnya. Iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya
     * fold(R, (R, T) -> R) : R             fold sama dengan reduce, yang membedakan adalah, fold memiliki inisial value R yang bisa kita masukkan secara manual
     *
     * Fold & Reduce Operator (2)
     * Fold & Reduce Operator                           Keterangan
     * reduceRight() & foldRight()                      Sama seperti reduce() dan fold() namun dimulai dari element akhir
     * reduceIndexed() & foldIndexed()                  Sama seperti reduce() dan fold() namun terdapat parameter index
     * reduceRightIndexed() & foldRightIndexec()        Sama seperti reduceIndexec() dan foldIndexec() namun dimulai dari element akhir
     */

    val list = (1..100).toList()
    val max = list.reduce { acc, i ->
        if (acc < i) {
            i
        } else {
            acc
        }
    }
    val sum = list.fold(0) { acc, i ->
        acc + i
    }

    println("list: $list")
    println("reduce from list: $max")
    println("fold from list: $sum")

}