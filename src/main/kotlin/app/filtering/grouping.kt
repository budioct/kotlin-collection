package app.filtering

fun main() {
    /**
     * Grouping
     * ● Grouping adalah operasi untuk meng-grup kan element-element yang ada di collection
     *
     * Grouping Operators
     * Grouping Operator                        Keterangan
     * groupBy((T) -> K) : Map<K, List<T>>      Menggabungkan collection menjadi group Map<K, List<T>>
     * groupingBy((T) -> K) : Grouping<K, T>    Menggabungkan collection menjadi object Grouping<K, T>
     *                                           Grouping interface akan dibahas lebih detail di materi terpisah
     */

    val list = listOf("a", "a", "b", "b", "c", "c", "d", "D", "aa", "cc", "BB")
    val map: Map<String, List<String>> = list.groupBy { it } // groupBy((T) -> K) : Map<K, List<T>>
    val map1: Map<Int, List<String>> = list.groupBy { value -> value.length } // groupBy((T) -> K) : Map<K, List<T>>
    val grouping : Grouping<String, String> = list.groupingBy { it } // groupingBy((T) -> K) : Grouping<K, T>


    println("map: $map") // map: {a=[a, a], b=[b, b], c=[c, c], d=[d], D=[D]}
    println("map: $map1") // map: {1=[a, a, b, b, c, c, d, D], 2=[aa, cc, BB]}
    println("grouping: $grouping") // grouping: app.filtering.GroupingKt$main$$inlined$groupingBy$1@2e817b38


}