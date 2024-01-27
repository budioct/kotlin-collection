package app

fun main() {

    /**
     * Checking Existence
     * ● Kotlin mendukung operasi untuk mengecek apakah dalam collection terdapat data yang kita cari
     *
     * Checking Existence Operator
     * Checking Existence Operator                   Keterangan
     * contains(element) :                           Boolean Mengecek apakah terdapat element di collection
     * containsAll(Collection<T>) :                  Boolean Mengecek apakah terdapat element collection T di collection
     * isEmpty() :                                   Boolean Mengecek apakah collection kosong
     * isNotEmpty() :                                Boolean Mengecek apakah collection tidak kosong
     *
     */

    val list = (1..10).toList()

    println(list.contains(7)) // true
    println(list.contains(12)) // false
    println(list.containsAll(listOf(1,2,3,4,5))) // true
    println(list.containsAll(listOf(11,21,13,41,15))) // false
    println(list.isEmpty()) // false
    println(list.isNotEmpty()) // true


}