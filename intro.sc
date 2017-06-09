
  def welcomeUser(name: String): Unit = {

    println("Hello ,"+name)
  }
welcomeUser("Emmanuel")


  def isEven(number: Int): Boolean = {

    if (number % 2==0)
      true
    else
      false
  }
  isEven(3)
  isEven(10)


  def uselessPrintFunction(): Unit = {
    println("All I do is print this!")
  }
uselessPrintFunction()

  def taxCalculator(amount: Double, taxPercentage: Int): Double = {

    (amount / 100)* taxPercentage
  }
  taxCalculator(1450, 20)


  class 