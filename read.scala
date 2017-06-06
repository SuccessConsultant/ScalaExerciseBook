/**
  * Created by Administrator on 06/06/2017.
  */
object read {

  def returnChars(name: String, location: Int): Unit = {

    println(name.takeRight(location))
  }

  def main(args: Array[String]): Unit = {
    returnChars("Jesus", 4)
  }
}
