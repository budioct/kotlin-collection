package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {

    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous()) // urutan di reverser
}

fun <T> displayMutableListIterator(listIterator: MutableListIterator<T>){

    while (listIterator.hasNext()) println(listIterator.next())

}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>){

    while (mutableListIterator.hasNext()){
        val item = mutableListIterator.next()
        if (item % 2 == 1){
            mutableListIterator.remove() // sisa pembagaian 1 (ganjil).. 2 (genap)
            println(item)
        }
    }
}

fun main() {

    displayListIterator(listOf("budhi", "oct", "22").listIterator()) // listIterator() : ListIterator<E> // akan casting menjadi iterable (supertype collection)
    displayMutableListIterator(mutableListOf(1,2,3,4,5,6,7,8,9,10).listIterator())
    removeOddNumber(mutableListOf(1,2,3,4,5,6,7,8,9,10).listIterator())


}