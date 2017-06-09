/**
  * Created by Administrator on 08/06/2017.
  */
object checkDay {

  val day = "Tuesday"
  val time ="5.30"

  def checkDay(day: String) {


  if ("Monday" == day)
    println("Meh it's " + day)
  else if ("Tuesday" == day)
    println("Getting there it's " + day)

  else if ("Friday" == day) {
    println("yay it's " + day)
    if ("5.30" == time) {
      println("Time to go home!" )
    }
  }

  }

  def main(args: Array[String]): Unit = {

  }
  checkDay("Monday")

  checkDay("Tuesday")

  checkDay("Friday")

}