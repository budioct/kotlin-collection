package app.`interface`

fun main() {

    /**
     * Grouping Interface
     * ● Sebelumnya kita sudah bahas tentang operasi Grouping, salah satunya adalah groupingBy yang menghasilkan object dari interface Grouping
     *
     * Grouping Interface Operator
     * Grouping Interface Operator                                      Keterangan
     * eachCount()                                                      Menghitung jumlah data di tiap group
     * reduce() dan fold()                                              Operasi reduce() dan fold() di tiap group
     * aggregate(key: K, accumulator: R?, element: T, first: Boolean)   Operasi aggregate data di tiap group, dimana jika data pertama mana parameter first bernilai true, dan accumulator akan bernilai null
     *
     */

    val list = listOf("a", "a", "b", "B", "b", "c", "C")
    val grouping: Grouping<String, String> = list.groupingBy { it }

    println(grouping.eachCount()) // {a=2, b=2, B=1, c=1, C=1}
    println(grouping.fold("") { accumulator, element -> accumulator + element }) // {a=aa, b=bb, B=B, c=c, C=C}
    println(grouping.reduce { key, accumulator, element -> accumulator + element }) // {a=aa, b=bb, B=B, c=c, C=C}
    println(grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) {
            element
        } else {
            accumulator + element
        }
    }) // {a=aa, b=bb, B=B, c=c, C=C}

}