import scala.io.StdIn._

object Q5 extends App{

  def AdditionOfEven(x:Int):Int={
    if(x%2==0){
      if(x==0)
        0
      else
        x+AdditionOfEven(x-1)
    }
    else{
      AdditionOfEven(x-1)
    }

  }



  print("Enter a Number : ")
  var x=readInt()

  println(AdditionOfEven(x))

}