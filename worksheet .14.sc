/*pattern matching
* */

// conditional Conditionals
/*Modify your method from the previous task to accept another parameter, a Boolean.
Your method will now check if that Boolean is true,
 and if it is then it will return the sum of the two numbers provided,
  if it is false it will return the multiplication of the two numbers instead.
 */




def myConditionals (numOne: Int, numTwo: Int, Condition: Boolean): Unit = {

  if (Condition)
    println("this is true so " + (numOne + numTwo))

  else println("this is false so " + (numOne * numTwo))


}

myConditionals(4,4, false)
myConditionals(4,4, true)




def patternConditions (n1: Int, n2: Int, value: Boolean): Unit = value match {

  case true => println(n1 + n2)
  case false => println(n1 * n2)
  case _ => println("Incorrect")

}

patternConditions(3, 4, true)
patternConditions(3, 4, false)
patternConditions(5, 5, true)

// conditionals 2 pattern match
def patternConditionals (a: Int, b: Int, c: Boolean): Int = {(a,b,c) match{
case (a,b,c) if a.equals(0)=> b
case (a,b,c) if b.equals(0)=> a
case (a,b,c) if a.equals(0) && b.equals(0) => 0
case (a,b,c) if a.equals(0) || b.equals(0)=> 0
    case(a,b,true) => a+b
    case(a,b,false)=> a*b
}
}
patternConditionals(0, 4, true)
patternConditionals(0, 4, false)
patternConditionals(8, 0, true)
patternConditionals(8, 0, false)
patternConditionals(0, 0, true)


/*
Pattern Matching 2
Create a method that takes a pair of integers
and then returns the pair swapped around using pattern matching
Input-> 1,2
Output->2,1
Your method should work with a List, Array and Tuple input.
Additional – Accept a Collection that has more than two inputs and returns the collection with the first two*/
def patternMatches(numb: Any): Any = numb match {

  case list: List[Int] => list.reverse
  case array: Array[Int] => array.reverse
  case tuple: Tuple2[Int, Int] => tuple.swap
  case _=>
}
patternMatches(1,2)



