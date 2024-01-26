package data

class Person(val name: String) {

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        return name == other.name
//    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name
        else -> false
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }

}