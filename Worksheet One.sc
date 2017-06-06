println("Hello World")

var a : String = "Hello World"
println (a)


// Create a method that accepts a string as a parameter, and then outputs that string.
def printString (stringTopPrint: String): Unit = {
  println(stringTopPrint)

}
println(printString("Emmanuel"))



// Return types - Create a method that returns a string, in this case “Hello World!”, which you then use to output.

def returnString(): String =  {

 "Hello World"

}

println(returnString())


/* Type Inference Create a method that does not signify a return type and outputs whatever is given to it
,then test it by passing it the follow different data types, Double, String, Integer, Boolean
 */

