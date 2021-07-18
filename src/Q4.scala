object Q4 extends App {
  def isEven(number: Int) = number % 2 == 0
  def isOdd(number: Int) = !isEven(number)


  val tests = List.range(-2, 100)


  for (n <- tests) {
    print(n)
    if (isEven(n)) {
      println(" -> Even")
    }
    if (isOdd(n)) {
      println(" -> Odd")
    }
  }


}
