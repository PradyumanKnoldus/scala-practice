object FunctionCaller extends App {

  //------------------------------------------------------------------//

  val stringCheckerObject = new StringChecker()
  println(stringCheckerObject.numberCheck("Khiladi786"))
  println(stringCheckerObject.numberCheck("Khiladi"))
  println(stringCheckerObject.digitCheck("Khiladi786"))
  println(stringCheckerObject.digitCheck("Khiladi"))

  //------------------------------------------------------------------//

  //------------------------------------------------------------------//

  val mathOperationObject = new MathematicalOperations()
  println(mathOperationObject.adder(5,5))
  println(mathOperationObject.substractor(5,5))
  println(mathOperationObject.square(5))
  println(mathOperationObject.cube(5))

  //------------------------------------------------------------------//

  //------------------------------------------------------------------//



  //------------------------------------------------------------------//
}