import scala.io.StdIn._
import scala.util.control.Breaks.break

object Q6 extends App{

  def fibSeq(n:Int):Int={

    if(n<=1)
      n
    else
      fibSeq(n-1)+fibSeq(n-2)

  }

  def printfibSeq(n:Int,i:Int){

    if(n==i)
      break
    else
      println(fibSeq(i))
    printfibSeq(n,i+1)

  }

  print("Enter a Number : ")
  var n=readInt()

  printfibSeq(n,0)

}