
class StringChecker {

  //BuiltIn Method
  def numberCheck(givenString: String): Boolean = {
    if (givenString.exists(_.isDigit)) true else false
  }

  //For Loop
  def digitCheck(givenString : String): Unit = {
    var flag = false

    for (index <- 0 until (givenString.length)) {
      if (givenString(index).isDigit) {
        flag = true
      }
    }

    if (flag) {
      println("true")
    } else {
      println("false")
    }
  }
}
