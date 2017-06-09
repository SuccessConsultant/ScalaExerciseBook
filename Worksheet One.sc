println("Hello World")

var a : String = "Hello World"
println (a)


// Create a method that accepts a string as a parameter, and then outputs that string.
def printString (stringToPrint: String): Unit = {
  println(stringToPrint)

}
printString("Emmanuel")



// Return types - Create a method that returns a string, in this case “Hello World!”,
// which you then use to output.

def returnString(): String =  {

 "Hello World"

}

println(returnString())


/* Type Inference Create a method that does not signify
a return type and outputs whatever is given to it
,then test it by passing it the follow different data types, Double, String, Integer, Boolean
 */

def receiveValue (something: Any): Unit = {
  println("hello " + something)
}

receiveValue("fhycf")
receiveValue(234)
receiveValue(2.2)
receiveValue(true)

/* Strings
Create a method that accepts two parameters, one being a string and one being an integer.
You method should return the amount of characters from the end of the string that the integer specifies
e.g.
Input -> (Hello,3)
Output -> llo
*/

def myFunc (someWord: String, someNumber: Int ): Unit = {

 println(someWord.substring(someWord.length - someNumber))
}



myFunc("Hello", 3)

/* Strings 2
Create a method that accepts 4 parameters, two being a String and two being a character, your method will then join both strings together and then replace all occurrences of the character provided with the second character provided.
Input-> (Ha, llo, a, e)
Output-> Hello
*/

def fourParameters (wordOne: String, wordTwo: String, charOne: Char, charTwo: Char ): String ={

 wordOne.concat(wordTwo).replace(charOne,charTwo)
  wordOne+(wordTwo).replace(charOne,charTwo)
}

fourParameters("Ha", "llo", 'a', 'e')


/* Operators
Create a method that accepts two Integers as an input, then returns the sum of those integers.
*/

def mySum (numOne: Int, numTwo: Int): Unit = {

  println(numOne + numTwo)
}

mySum(4,4)


/* Conditionals - Modify your method from the previous task to accept another parameter, a Boolean.
 Your method will now check if that Boolean is true, and if it is then it will return the sum of the two numbers provided,
 if it is false it will return the multiplication of the two numbers instead.
*/

def myConditionals (numOne: Int, numTwo: Int, Condition: Boolean): Unit = {

  if (Condition)
    println("this is true so " + (numOne + numTwo))

  else println("this is false so " + (numOne * numTwo))


}

myConditionals(4,4, false)
myConditionals(4,4, true)



/* Conditionals 2
Modify your method from the previous task to have some more conditional statements to check if one of the numbers is 0,
which if this is true then you should return the other non-0 number. If both numbers are 0 then return 0
*/

def changeConditions (x: Int, y: Int, add: Boolean) =
  if (x == 0)  y
  else if (y == 0)  x
  else if (x == 0 && y == 0) 0
  else if (add) x + y
  else x*y

changeConditions(0,1, false)
 // try to make this into a pattern matching

/* Iteration
Create a method that accepts two parameters, a string and an integer.
You method should print out the string provided as many times as the integer designates
Input-> Hi, 3
Output -> Hi Hi Hi
*/

def Iteration1(string: String, value: Int): Unit = {

  for (i <- 1 to value)
    print(string)
}

Iteration1("Hi", 10)


/*Create a method accepts two parameters, one a String and the other an integer,
your method will then output that string in a rectangle-like fashion as many times as the number dictates.
 Input-> H,4
Output-> HHHH
         HHHH
         HHHH
         HHHH
Once that’s done, add formatting so it’s always outputted as a square.
*/


def nestedForLoop(singleChar: String, value: Int): Unit = {

  for (i <- 1 to value) {
    for (j <- 1 to value){
      print(singleChar)
    }
    println()
  }
}

nestedForLoop("H", 4)


/* Iteration 3 - FizzBuzz
Create a method that accepts three parameters, two strings and one integer.
Your method will then loop from 1 to the integer provided,
outputting the current iteration count every iteration.
However if the current iteration is divisible by 3, output the first String provided.
If the current iteration is divisible by 5, output the second String provided.
If it is divisible by both 3 and 5, then output the concatenation of the two Strings.
Input-> (Fizz,Buzz,15)
Output-> 1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz
*/


def fizzBuzz (s1: String, s2: String, end: Int): Unit = {

  for (i <- 1 to end){

     if (i % 3 == 0 && i % 5 == 0)
    println(s1 + s2)

     else if(i % 3 == 0)
      println(s1)
    else if (i % 5 == 0)
      println(s2)

    else println(i)

  }

}
fizzBuzz("Fizz","Buzz", 15)

/*Iteration 4
Rewrite your previous three iteration exercises but using method recursion, no loops involved.
*/

def recursivePa (s1:String, n: Int): Any = {

 if (n == 0)
   println (" ")
 else  print(s1)
  recursivePa(s1, n - 1)

}
recursivePa("Hi", 3)



