object FunctionCaller extends App {

  new HelloScalaWorld()

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
  println(mathOperationObject.mixedform(5,6))


  //------------------------------------------------------------------//

  val myArray = Array(1, 2, 3, 4, 5)
  val arrayProductObject = new ArrayProduct(myArray)
  println(arrayProductObject.print())

  //------------------------------------------------------------------//



  //------------------------------------------------------------------//
}