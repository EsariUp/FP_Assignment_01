import scala.io.StdIn._
import scala.util.control.Breaks._

object Q2 extends App{

  def gcd(x:Int,y:Int):Int=y match{
    case 0=>x
    case y if(y>x) =>gcd(y,x)
    case _ =>gcd(y,x%y)
  }

  def isPrime(n:Int,i:Int):Boolean= n match{
    case n if n==i => true

    case n if gcd(n,i)>1 => false

    case x  =>isPrime(n,i+1)

  }

  def primeSeq(n:Int,i:Int){
    if(n==i) {
      break
    }

    if(isPrime(i,2)){
      println(i)
    }

    primeSeq(n,i+1)

  }
  print("Enter a Number : ")
  var n=readInt()

  primeSeq(n,2)

}
