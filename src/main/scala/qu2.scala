def checkInput(input: Int) = {
  input match {
    case n if n <= 0     => println("Negative/Zero is input")
    case n if n % 2 == 0 => println("Even number is given")
    case n               => println("Odd number is given")
  }
}

@main def Main() = {
  println("Enter an intiger value :-")
  val data = scala.io.StdIn.readInt()
  checkInput(data)

}
