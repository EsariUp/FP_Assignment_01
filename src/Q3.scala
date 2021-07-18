
import scala.io.StdIn._

object Q3 extends App{

  def add(a:Int):Int={

    if(a==0)
      0
    else
      a+add(a-1)

  }



  print("Number to be added : ")
  var a=readInt()

  println(add(a))

}