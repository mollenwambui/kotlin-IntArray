fun main(){
  var x=  multiplication(arrayOf(20,2,3))
    println(x)
  var sum= mixedArrays(arrayOf("John",20,10.5,"food",5.5,true))
    println(sum)
    var characters = characters(arrayOf('a', 'b', 'e', 'o', 'f','j','u'))
    println(characters)
}
//Write a function that takes in an array of integers and returns the product of
//all the elements

fun multiplication(multiply:Array<Int>):Int{
    var product=1
    multiply.forEach { num->
        product*=num
    }
    return  product
}
//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements

fun mixedArrays(results:Array<Any>):Double{
  var sum= 0.0
    results.forEach { num ->
        if (num is Double)
            sum+=num
    }
       return sum
}
//Write a function that takes in an array of characters and returns the number of
//vowels in the array
fun characters(vowel:Array<Char>):Int{
    var char=0
    vowel.forEach { c ->
        if (c=='a'||c=='e' ||c=='i'||c=='o'||c=='u')
            ++char
    }
    return  char
}

