package app

fun main() {

    /**
     * Transformations : Association
     * ● Association adalah operasi transformasi dari collection menjadi map
     * ● Dalam beberapa operasi association, element hasil bisa menjadi key atau value
     *
     * Transformations : Association Operation
     * Association Operation                Keterangan
     * associate((T) -> Pair<K, V>)         Merubah collection T menjadi Map<K, V>
     * associateWith(T -> V)                Merubah collection T menjadi Map<T, V>
     * associateBy(T -> K)                  Merubah collection T menjadi Map<K, T>
     *
     */

    val list = listOf("budhi", "oct", "22")
    val map1: Map<String, Int> = list.associate { Pair(it, it.length) }
    val map2: Map<String, Int> = list.associateWith { it.length }
    val map3 = list.associateBy { it.length } // hasil di reverse unturan key dan value

    println(list) // [budhi, oct, 22]
    println(map1) // {budhi=5, oct=3, 22=2}
    println(map2)
    println(map3) // {5=budhi, 3=oct, 2=22} //


}