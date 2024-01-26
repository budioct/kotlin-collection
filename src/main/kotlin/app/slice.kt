package app

fun main() {
    /**
     * Slice Operator
     * ● Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection yang sesuai dengan parameter range
     *
     * Slice Operator        Keterangan
     * slice(range)          Mengambil sebagian element yang ada di collection sesuai dengan index range
     */

    val list1 = (0..100).toList()
    val list2 = list1.slice(0..50) // get element
    val list3 = list1.slice(0..100 step 2) // get elemet dengan 2 langkah
    val list4 = list1.slice(100 downTo 0 step 2) // get elemet dengan 2 langkah

    println("list1: $list1")
    println("list2: $list2")
    println("list3: $list3")
    println("list4: $list4")

}