fun sumofevennumbers(number:List<Int>) : Int{
    var result = 0

    for(num in number){
       if(num %2==0){
           result+=num
       }
    }

    return result
}



fun ispositive(number:Int):String{
    var str = ""
    when{
        (number==0) -> str="zero"
        (number>0)  -> str="positive"
        (number<0)  -> str = "negative"
    }

    return str
}



fun fibbo(){
    var arraylist = ArrayList<Int>()
    arraylist.add(0)
    arraylist.add(1)
    var step1 = 1
    var step2 = 0
    for(i in 1..10){
    var new = arraylist.get(step2)+arraylist.get(step1)
        arraylist.add(new)
        step1++
        step2++
    }
 for(elements in arraylist) {
     print(" ")
     print(elements)
     print(" ")
 }
}


fun nullableStringLength(input: String?): Int{
    return input?.length?:0
}

fun String.countvowels():Int{
    var length = this.length
    var counter = 0
    for(i in 0..length-1){
      when(this[i]){
          'a' -> counter++
          'A' -> counter++
          'e' -> counter++
          'E' -> counter++
          'i' -> counter++
          'I' -> counter++
          'o' -> counter++
          'O' -> counter++
          'u' -> counter++
          'U' -> counter++
      }
    }
    return counter
}

fun main() {
    var number : Int = 10
    var dob : Double = 10.5
    var name2 : String = "amr"
    var bool : Boolean = false
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)


    val lambda : (List<Int>) -> List<Int> = { list ->
        val newnumbers = mutableListOf<Int>()

        for(element in list){
            if(element %2==0){
                newnumbers.add(element)
            }
        }
        newnumbers
    }

    println(number)
    println(dob)
    println(name2)
    println(bool)


    number = 20
    dob = 20.5
    name2 = "sherif"
    bool = true


    println("")
    println("")
    println("")


    println(number)
    println(dob)
    println(name2)
    println(bool)

    // sum of even numbers
    println("")
    println("")
    val res = sumofevennumbers(numbers)
    println("the sum of even numbers in the list is = $res")

// determine if positive or negative int
    println("")
    println("")
    println("enter a number to determine if it is a poitive or negative integer")
    val input = readLine()
    val ispos = input?.toIntOrNull()
    if(ispos !=null){
        var string = ispositive(ispos)
        println(" the number is $string")
    }
    else{
        println("wrong input")
    }
// calling fibo
    fibbo()

    //Using lambda expression to filter evn numbers
    println("")
    println("")
    val newnumbers = lambda(numbers)
    println(newnumbers)

    //higher order function
    println("")
    println("")
    println("")
    val lowerstrings = listOf("apple", "banana", "orange")


    fun Uppercase(strings: List<String>):List<String>{
        var newstr = mutableListOf<String>()
        for(str in strings){
            newstr.add(str.toUpperCase())
        }
        return newstr
    }

    fun applyToStrings(stringss: List<String>, func: (String) -> String): List<String>{
        val neww = mutableListOf<String>()
        for(str in stringss){
            val transformed = func(str)
            neww.add(transformed)
        }
        return neww
    }

    val uperedstr = applyToStrings(lowerstrings){it.uppercase()}
    println(uperedstr)

//    mapping collection

    var mymap :MutableMap<Int ,String> = mutableMapOf()
    mymap.put(1,"ITWorx")
    mymap.put(2,"ITWor")
    mymap.put(3,"ITWo")
    mymap.put(4,"ITW")
    mymap.put(5,"IT")

    for((Key,value) in mymap){
        if(value.length<=3)
            println(" the value is $value")
    }

//    String length map
    val list: List<String> = listOf("cyber security", "Software engineer", "IT","ayhaga")
  fun mapStringLengths(strings: List<String>): MutableMap<Int, String> {
      val newMap = mutableMapOf<Int, String>()
      for(string in strings){
         var length = string.length
          newMap.put(length,string)
      }
      for ((length, string) in newMap) {
          println("Length: $length, String: $string")
      }
      return newMap
  }
mapStringLengths(list)

    //class person
    println("")
    println("")
    println("")
   val amr = Person("amr",22)
    amr.displaydetails()

    //inheritance
    val civic = car("honds","civic",200)
    civic.displaydetails()

    val bolevard = motorcycle("suzuki","bolevard ","yellow")
    bolevard.displaydetails()

//    11.null safety

    var word : String? = "hello world"
    println(nullableStringLength(word))
    word= null
    println(nullableStringLength(word))

//    12.	Null Safety Operators:

    var name : String? ="amr sherif"
    println(name?.length)
    name = null
    println(name?.length?:"no length")

//    13. extensions

    var S ="amr sherIif"
    println(S.countvowels())

//    14.operator overloading

   var r = complexnumbers(2,4)
    var f = complexnumbers(1,8)
    var result = f+r
    result.disp()

}