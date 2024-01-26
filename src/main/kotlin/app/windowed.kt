package app

fun main() {
    /**
     * Windowed Operation
     * ● Windowed adalah operasi untuk mendapatkan semua kemungkinan collection sesuai dengan range yang telah ditentukan
     *
     * Windowed Operator
     * Windowed Operator                                        Keterangan
     * windowed(size, step, partialWindow)                      Mengambil semua kemungkinan collection sebesar size, dilanjut dengan step, dan diakhiri dengan partialWindow
     * windowed(size, step, partialWindow, transform)           Sama seperti windowed() sebelumnya, namun hasil collection di transform
     */

    val list = (1..5).toList()
    println(list.windowed(3, 1, false))
    println(list.windowed(3, 1, false) { value -> value.size })
    println(list.windowed(3, 1, true))
    println(list.windowed(3, 1, true) { it.size })
    println(list.windowed(3, 2, false))
    println(list.windowed(3, 2, true))

}