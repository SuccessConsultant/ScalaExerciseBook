/**
  * Created by Administrator on 06/06/2017.
  */
object twoParameter {

  def myFunc(someWord: String, someNumber: Int): Unit = {

    println(someWord.substring(someWord.length - someNumber))
  }

  def main(args: Array[String]): Unit = {

    myFunc("Hello", 3)

  }


}

