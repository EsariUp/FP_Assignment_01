object Q1 extends App{

  def prime(p:Int,n:Int=2):Boolean =n match{
    case x if(x<=1)=> false
    case x if(x==2)=> true
    case x if(x%n==0)=> false
    case x if(n*n>x)=> true
    case x => prime(x,n+1)

  }
  println(prime(37))


}
