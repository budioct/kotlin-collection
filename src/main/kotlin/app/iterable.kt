package app

fun <T> displayIterable(iterable: Iterable<T>){

    val iterator = iterable.iterator() // iterable casting ke iterator
    while (iterator.hasNext()) println(iterator.next())
}

fun <T> displayMutableIterable(iterable: MutableIterable<T>){

    val iterator = iterable.iterator() // iterable casting ke iterator
    while (iterator.hasNext()) println(iterator.next())

}

fun main() {

    displayIterable(listOf("budhi", "oct", "22"))
    displayIterable(setOf("budhi", "oct", "22"))
    displayMutableIterable(mutableListOf("budhi", "oct", "22"))
    displayMutableIterable(mutableSetOf("budhi", "oct", "22"))
}