fun main() {
    val array = arrayListOf(2,4,6,8,100,7,9,1)
//    reverseArray()
//    reverseString()
//    searchAnElement()
//    maxAndMin(array)
    missnNum()
}

fun reverseArray(array:ArrayList<Int>){
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

fun reverseString(array:ArrayList<Int>){
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

fun searchAnElement(array:ArrayList<Int>){
    var i = 0
    val textElement = 10
    var result = 0
    while (i<array.size-1){
        if (array[i]==textElement){
            result = i
        }
        i+=1
    }
    println(result)
}

fun maxAndMin(array:ArrayList<Int>){

    var min = array[0]
    var max = array[0]
    var i = 0
    while (i<array.size){
        if(array[i]<min){
            min = array[i]
        }
        if(array[i]>max){
            max = array[i]
        }
        i+=1
    }
    println(min)
    println(max)
}

fun missnNum(){
    val a = arrayListOf(1,2,3,4,5,7,8)
    var i = 1
    var result = 0
    while (i<=a.size){
        if(!a.contains(i)){
            result = i
        }
        i+=1
    }
    println(result)
}