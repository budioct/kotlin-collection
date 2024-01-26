package app

fun main() {

    /**
     * Konversi Collection
     * ● Di kotlin kita bisa melakukan konversi collection ke jenis collection lain secara mudah
     * ● Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, bisa dilakukan dengan mudah
     * ● Semua function dimulai dengan kata “to”, misal toList, toSet, toMutableList, dan lain-lain
     */

    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val range = 1 .. 100
    val list = range.toList() // range casting ke list
    val mutableList = array.toMutableList() // array casting ke mutableList
    val set = list.toSet() // list casting ke set
    val mutableSet = list.toMutableSet() // list casting ke mutableSet
    val sortedSet = list.toSortedSet() // lit casting ke sortedSet

}