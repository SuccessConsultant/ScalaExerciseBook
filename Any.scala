/**
  * Created by Administrator on 06/06/2017.
  */
object Any {

  def receiveValue (any: Any): Unit = {
    println(any)
  }



  def main(args: Array[String]): Unit = {

    receiveValue("fhycf")
    receiveValue(234)
    receiveValue(2.2)
    receiveValue(true)

  }

}
