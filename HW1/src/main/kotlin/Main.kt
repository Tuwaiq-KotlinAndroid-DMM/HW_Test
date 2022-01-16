fun main(args: Array<String>) {

    println("Enter your name")

    var StudentName = readLine()
    println("Enter your coming time")

    var studentAttendance = readLine()!!.toInt()


    if (studentAttendance <= 8) {
        println("$StudentName Present")

    } else if (studentAttendance <= 10) {
        println("$StudentName Late")

    } else {
        println("$StudentName Absent")
    }
}
