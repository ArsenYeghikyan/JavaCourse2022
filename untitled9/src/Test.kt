fun main() {

//    var hours = readLine()!!.toInt()
//    var t1: Int = 0
//    var t2: Double = 0.0
//    var total: Double = 0.0
//    if (hours in 1..5) {
//        total = 5 * 1.0
//    }
//    if (hours in 6..23) {
//        total = (hours - 5.0) * 0.5 + 5.0
//    }
//    if (hours == 24) {
//        total = 15.0
//    }
//    if (hours in 24..47) {
//        total = (hours - 24.0) * 0.5 + 15.0
//    }
//    if (hours >= 48) {
//        t1 = hours / 24
//        t2 = hours % 24.0
//        total = (t1 * 15) + t2 * 0.5
//    }
//    if (hours < 0) {
//        total = 0.0
//    }
//
//
//
//
//
//
//    print(total)
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    var day : Int = hours/24
    var addhours : Int = hours%24
    total = when {
        hours in 6..23 -> 5.0+(hours-5)*0.5
        hours >= 24 -> (addhours*0.5) + (day*15)
        else -> hours*1.0
    }
    println(total)

}