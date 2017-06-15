/*
Blackjack
Given 2 integer values greater than 0, return whichever value is closest to
21 without going over 21. If they both go over 21 then return 0
Input(18,21) -> 21
Input(20,18) -> 20
Input(22,22) -> 0
*/


/*def input(x: Int, y: Int): Int = (x,y) match {

}*/

// blackjack using if statements


def BlackJack(play1: Int, play2: Int): Unit = {

  if ((play1 > play2) && (play1 <= 21 && play1 > 0))
    {println("Player 1 Score is " + play1)}
  else if((play1 < play2) && (play2 <= 21 && play2 > 0))
    {println("Player 2 score is ",+ play1)}
  else if((play1 > 21) && (play2 > 21)) {println("Busted ")}
}
BlackJack(22, 22)


/* Unique Sum
Given 3 integer values, return their sum. If one value is the same as another value,
they do not count towards the sum. Aka only return the sum of unique numbers given.
Input(1,2,3) -> 6
Input (3,3,3) -> 0
Input (1,1,2) -> 2
*/
def UniqueSum(x: Int, y: Int, z: Int): Unit = {

  val list = List(x, y, z)
  var sum = 0

  list.foreach(ls => if (list.count(x => x == ls) == 1) sum += ls)
println(sum)
}
UniqueSum(2,6,3)

/*Too hot?
Given an integer value and a Boolean value, temperature and isSummer,
if temperature is between 60 and 90 (inclusive),
unless its summer where the upper limit is 100 instead of 90.
Return true if the temperature falls within the range, false otherwise.*/

