val day = "Tuesday"

def checkDay(day: String) {

  if ("Monday" == day)
    println("Meh it's " + day)
  else if ("Tuesday" == day)
    println("Getting there it's " + day)
  else if ("Friday" == day)
    println("yay it's " + day)

}

def main(args: Array[String]): Unit = {


}

checkDay("Monday")

checkDay("Tuesday")

checkDay("Friday")