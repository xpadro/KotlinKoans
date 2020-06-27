import java.time.LocalDate

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        val date1 = LocalDate.of(this.year, this.month, this.dayOfMonth)
        val date2 = LocalDate.of(other.year, other.month, other.dayOfMonth)

        return date1.compareTo(date2)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
