fun main() {
    val array = arrayListOf(2,4,6,3,100,7,9,1)
//    reverseArray()
//    reverseString()
//    searchAnElement()
//    maxAndMin(array)
//    missnNum()
//    waveArray()
//    bitonicPoint()
//    maxOfSub()
    valEqualIndex(array)
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

