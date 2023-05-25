package low

/*
* Use only basic arithmetic operations
* and loops to solve following problems:
* */

fun f201(number: Int): Int {
    var count = 1
    var divisible = number
    while(divisible / 10 > 0) {
        divisible /= 10
        count++
    }
    return count
}

fun f202(number: Int): Int {
    var sum = 0
    var divisible = number
    while(divisible / 10 > 0) {
        sum += divisible % 10
        divisible /= 10
    }
    sum += divisible
    return sum
}

fun f203(number: Int): Int {
    var product = 1
    var divisible = number
    while(divisible / 10 > 0) {
        product *= divisible % 10
        divisible /= 10
    }
    product *= divisible
    return product
}

fun f204(number: Int) {
    var divisible = number
    while(divisible / 10 > 0) {
        println(divisible % 10)
        divisible /= 10
    }
    println(divisible)
}

fun Int.getDigit(index: Int) {
    TODO()
}

