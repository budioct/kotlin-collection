package app

fun main() {

    /**
     * Aggregate
     * ● Kotlin memiliki berbagai operasi untuk melakukan aggregate
     *
     * Aggregate Operator (1)
     * Aggregate Operator       Keterangan
     * max() dan min()          Mengambil nilai maksimal dan minimum
     * average()                Mengambil nilai rata-rata
     * sum()                    Mengambil nilai jumlah seluruh element
     * count()                  Mengambil berapa banyak element
     *
     * Aggregate Operator (2)
     * Aggregate Operator                               Keterangan
     * maxBy(selector) dan minBy(selector)              Mengambil nilai maksimal dan minimum
     * maxWith(Comparator) dan minWith(Comparator)      Mengambil nilai maksimal dan minimum sesuai comparator
     * sumBy(selector)                                  Mengambil nilai jumlah seluruh element sesuai selector
     * sumByDouble(selector)                            Sama dengan sumBy() namun menghasilkan Double
     */

    val numbers = (1..100).toList()

    println(numbers.max())
    println(numbers.min())
    println(numbers.average())
    println(numbers.count())
    println(numbers.sum())

    println(numbers.sumBy { it / 2 })

}