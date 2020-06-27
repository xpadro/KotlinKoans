class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange: DateRange): Iterator<MyDate> {
    var currentDate: MyDate = dateRange.start

    override fun hasNext(): Boolean = currentDate <= dateRange.end

    override fun next(): MyDate {
        val result = currentDate
        currentDate = currentDate.followingDate()
        return result
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}