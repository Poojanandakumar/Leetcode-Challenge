fun main() {
//    reverseArray()
    reverseString()
}

fun reverseArray(){
    val array = arrayListOf(2,4,6,8,10,7,9,1)
    var i = 0
    var j = array.size-1
    while (i<(array.size-1)/2){
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
        i += 1
        j -= 1
    }
    println(array)
}

fun reverseString(){
    val string = "pooja"
    var result = ""
    var i = string.length-1

    while (i>0){
        result += string.get(i).toString()
        i -= 1
    }
    println(result)
    //or string.reversed
}