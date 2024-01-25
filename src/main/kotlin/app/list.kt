package app

fun main() {

    val list: List<String> = listOf("budhi", "oct", "22")

    println(list[0]) // akses index // get value
    println(list[1])
    println(list[2])
    println(list.indexOf("budhi")) // return index // cek value tersebut ada di index berapa
    println(list.indexOf("tidak ada")) // jika tidak ada -1
    println(list.contains("budhi")) // return boolean // cek apakah value ada di dalam list
    println(list.contains("tidak ada"))
    println(list.containsAll(listOf("budhi", "oct"))) // return boolean // cek apakah value(dalam list) ada di dalam list
    println(list.containsAll(listOf("tidak ada", "asekk")))
    println(list.isEmpty()) // return boolean // cek apakah list kosong
    println(list.isNotEmpty())

    println("\nmutable list")

    val mutableListOf: MutableList<String> = mutableListOf<String>()
    mutableListOf.add("satu")
    mutableListOf.add("dua")
    mutableListOf.add("tiga")

    println(mutableListOf[0])
    mutableListOf.forEach { data -> println("loop data 1: $data") } // iterasi
    mutableListOf.remove("dua") // hapus data
    mutableListOf.forEach { data -> println("loop data 2: $data") } // iterasi

}