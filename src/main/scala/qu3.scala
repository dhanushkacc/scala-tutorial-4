def toUpper(input: String): String = {
  input.toUpperCase
}

def toLower(input: String): String = {
  input.toLowerCase
}

def NameFormat(name: String)(formatting: String => String): String = {
  formatting(name)
}

@main def Main() = {

  println(NameFormat("Benny")(toUpper))
  println(NameFormat("Ni")(toUpper) + "roshan")
  println(NameFormat("Saman")(toLower))
  println("Kumar" + NameFormat("a")(toUpper))

}
