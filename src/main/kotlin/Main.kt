import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val array = arrayListOf(1,2,3,1)

//    reverseArray()
//    reverseString()
//    searchAnElement()
//    maxAndMin(array)
//    missnNum()
//    waveArray()
//    bitonicPoint()
//    maxOfSub()
//    valEqualIndex(array)
//    rotateArr()
//    firLastOcc()
//sortArray(array)
//    lead(array)
//    alternate()
//    DSA.pattern1(4)
//    println(DSA.peak())
//    println(DSA.searchFirsthalf())
//    println(DSA.cyclicSortMissingNo())
    println(DSA.kidsWithCandies())

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

fun waveArray(){
    val a = arrayListOf(2,4,7,8,9,10)
    var i = 0
    while (i+1<a.size){
        val temp = a[i]
        a[i] = a[i+1]
        a[i+1] = temp
        i+=2
    }
    println(a)
}

fun bitonicPoint(){
    val a = arrayListOf(1,15,25,45,42,21,17,12,11)
    var i = 0
    var result = 0
    while (i<a.size){
        if(a[i]<a[i+1]){
            i+=1
        }else{
            result = a[i]
            break
        }
    }
    println(result)
}

fun maxOfSub(){
    val a = arrayListOf(1, 2, 3, 1, 4, 5, 2, 3, 6)
    var i = 0
    val m = 2
    val set = arrayListOf<Int>()
    val result = arrayListOf<Int>()
    while (i<a.size-m){
        val j = i+2
        for (x in i..j){
            set.add(a[x])
        }
        var max = set[0]
        var k = 0
        while (k<set.size){
            if(set[k]>max){
                max = set[k]
            }
            k+=1
        }
        result.add(max)
        i+=1

    }
    println(result)

}

fun valEqualIndex(a:ArrayList<Int>){
    var i = 0
    var result = 0
    if(a.size==0){
        result = 0
    }
    while (i<a.size){
        if(i==a[i]){
            result = i
        }
        i+=1
    }
    println(result)
}

fun reverseNumber(num:Int):Int{
    var number = num
    var reminder = 0
    var reverse = 0
    while(number!=0){
        reminder = number%10
        reverse = reverse*10+reminder
        number = number/10
    }
    return reverse
}

fun palinArray(){
    val array = arrayListOf(111, 222, 333, 444, 555)
    var result = 1
    array.forEach{
            item->
        if(item!=reverseNumber(item)){

            result=0
        }
    }
    println(result)
}

fun rotateArr() {
    val arr = arrayListOf(1, 2, 3, 4, 5)

    if (arr.size == 1) {
        println(arr[0])
    }
    if (arr.size <= 0) {
        println("no result")
    }
    if (arr.size > 0 && arr.size != 1) {
        var i = arr.size - 1
        var x = arr[arr.size - 1]
        while (i > 0) {
            arr[i] = arr[i - 1]
            i -= 1
        }
        arr[0] = x
        println(arr)
    }
}

    fun firLastOcc() {
        val arr = arrayListOf(1, 3, 5, 5, 5, 5, 7, 123, 125)
        var i = 0
        val x = 2
        var first = -1
        var last = -1
        while (i < arr.size) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i
                } else {
                    last = i
                }
            }
            i += 1
        }
        if (last == -1) {
            last = first
        }

        println(first)
        println(last)
    }

fun sortArray(a:ArrayList<Int>){

}

fun lead(a:ArrayList<Int>){
    var leaders = arrayListOf<Int>()
    var lLead = 0
    while (lLead<=a.size-1){
        var lead = a[lLead]
        var j = lLead+1
        var isLead = true

        while (j<=a.size-1){
            if(a[j]>lead){
                isLead = false
                break
            }else{
                isLead = true
                j += 1
            }
        }

        if(isLead){
            leaders.add(lead)
        }
        lLead += 1

    }
    println(leaders)
}

fun alternate(){
    val array = intArrayOf(7,1,2,3,4,5,6)
    var ascb = array
    var desb = array

    ascb.sort()

    desb.sortDescending()
    var res = arrayListOf<Int>()
    var i = 0
    print(ascb.joinToString())
    print(desb.joinToString())
//    while (i<array.size){
//        var k = 0
//        res[i] = asc
//    }
}







