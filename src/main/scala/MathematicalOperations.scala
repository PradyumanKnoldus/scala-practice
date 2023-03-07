// Anonymous Functions

class MathematicalOperations {

  val square: (Int) => (Int) = (number : Int) => number * number

  val cube: (Int) => (Int) = (number : Int) => number * number * number

  val adder : (Int , Int) => (Int) = (number: Int, number2: Int) => number + number2

  val substractor : (Int , Int) => (Int) = (number: Int, number2: Int) => number - number2

}
