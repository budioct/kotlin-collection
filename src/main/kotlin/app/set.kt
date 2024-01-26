package app

import data.Person

fun main() {

    // Set<T> ada hashcode() dan equals() untuk pengecekan data yang duplikat
    val set: Set<Person> = setOf(
        Person("budhi"),
        Person("oct"),
        Person("budhi"),
        Person("oct")
    )

    println(set.size) // size // cek panjang set
    println(set.contains(Person("budhi"))) // contains(E) // apakah ada data tersebut di dalam set
    println(set)

    for (person in set) { println("loop 1: ${person.name}") } // loop for
    set.forEach { data -> println("loop 2: ${data.name}") } // loop foreach lambda

    println("\nmutable set")

    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("budhi"))
    mutableSet.add(Person("oct"))
    mutableSet.add(Person("22"))
    mutableSet.add(Person("budhi"))
    mutableSet.add(Person("oct"))

    println(mutableSet.size) // size // cek panjang set
    println(mutableSet.contains(Person("budhi"))) // contains(E) // apakah ada data tersebut di dalam set
    println(mutableSet)

    for (person in mutableSet) { println("loop 1: ${person.name}") } // loop for
    mutableSet.remove(Person("budhi"))
    mutableSet.forEach { data -> println("loop 2: ${data.name}") } // loop foreach lambda


}