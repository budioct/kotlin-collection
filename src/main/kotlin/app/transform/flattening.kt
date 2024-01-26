package app.transform

class Member(val name: String, val hobbies: List<String>)
fun main() {

    /**
     * Transformations : Flattening
     * ● Flattening adalah operasi transformasi untuk menjadikan nested collection menjadi flat
     *
     * Transformations : Flattening Operation
     * Flattering Operation             Keterangan
     * flatten                          Mengubah nested collection menjadi flat collection
     * flatMap((T) -> Iterable<R>)      Mengubah collection T menjadi flatcollection R
     */

    val list: List<List<String>> = listOf(
        listOf("budhi", "22"),
        listOf("husein", "14"),
    )

    val flatten: List<String> = list.flatten() // flatten() // nested collections menjadi flat collection
    println(list) // [[budhi, 22], [husein, 14]]
    println(flatten) // [budhi, 22, husein, 14]

    // flatten 2
    val members: List<Member> = listOf(
        Member("budhi", listOf("code", "sleep")),
        Member("akmal", listOf("football", "futsal"))
    )

    val hobbies = members.flatMap { it.hobbies } // flatMap() // type collection menjadi collection return
    println(members) // [app.transform.Member@1a6c5a9e, app.transform.Member@37bba400]
    println(hobbies) // [code, sleep, football, futsal]


}