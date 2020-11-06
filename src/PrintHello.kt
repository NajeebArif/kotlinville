fun main() {
    var x=3
    val name = "Najeeb"
    x += 10
    print("x is $x\n")
    println("==================================")
    while (x>0){
        x-=1
        print("x is now $x\n")
    }
    println("==================================")
    for (i in 1..10){
        x+=1
        print("x is now $x\n")
    }
    println("==================================")
    println(if (x==20) "x is 20" else "x is not 20")
    println("==================================")
    //TODO add code for array operation
    var array1: Array<Int> = arrayOf(1,2,3)
    var sizeOfMyArray: String = "The size of my array is ${array1.size} and thus it is a ${if(array1.size>5) "large" else "small"} array."
    println(sizeOfMyArray)
}