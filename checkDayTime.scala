/**
  * Created by Administrator on 08/06/2017.
  */
object checkDayTime {

  val day = "Friday"
  val time = "5.30"

  def checkDayTime(day: String) {
    if ("Monday" == day)
      println("Meh it's " + day)
    else if ("Tuesday" == day)
      println("Getting there it's " + day)

    else if ("Friday" == day) {
      println("yay it's " + day)
      if ("5.30" == time) {
        println("Time to go home!")
      }

    }

  }

  def main(args: Array[String]): Unit = {

    checkDayTime("Monday")

    checkDayTime("Tuesday")

    checkDayTime("Friday")
  }
}


