package app

fun main() {

    /**
     * Map Specific Operations
     * ● Di kotlin juga terdapat banyak operasi yang khusus untuk Map
     *
     * Map Specific Operator
     * Map Specific Operator                    Keterangan
     * getOrElse(key, (key) -> V)                Mengambil value sesuai key, jika tidak ada eksekusi lambda
     * getValue(key)                             Mengambil value sesuai key, atau throw exception
     * filter((Entry<K,V>) -> Boolean)           Filter sesuai kondisi
     * filterKeys((K) -> Boolean)                Filter dengan kondisi key
     * filterValues((V) -> Boolean)              Filter dengan kondisi value
     */

    val map = mapOf(
        "a" to "budhi",
        "b" to "oct",
        "c" to "sadam",
        "d" to "malik",
        "e" to "jamal"
    )

    println(map.getValue("a")) // budhi
    println(map.getOrElse("e") { "ups data tidak ada" }) // jamal
    println(map.filter { (key, value) -> value.length > 4 }) // {a=budhi, c=sadam, d=malik, e=jamal}
    println(map.filterKeys { key -> key > "b" }) // {c=sadam, d=malik, e=jamal}
    println(map.filterValues { it.length > 5 }) // {}

}