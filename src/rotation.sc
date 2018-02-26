def rotateMatrix(matrix:Array[Array[Int]]):Array[Array[Int]] = {
  matrix
}

def rotateLayer(layer: Int,matrix:Array[Array[Int]]): Array[Array[Int]] = {
  matrix
}

var matrix = Array(Array(1,2,3),
                   Array(4,5,6),
                   Array(7,8,9))

val m =3
val layer = 1

for (i <- 0 to 0) {
  val temp = matrix(0)
  //top to right
  val right = matrix(i)(m-i-1)
  println(s"Right: $right")
  matrix(i)(m-i-1) = matrix(i)(i)
  //right to bottom
  val bottom = matrix(m-i-1)(m-i-1)
  println(s"Bottom: $bottom")
  matrix(m-i-1)(m-i-1) = right
  //bottom to left
  val left = matrix(m-i-1)(i)
  println(s"Left: $left")
  matrix(m-i-1)(i) = bottom
  //left to top
  val top = matrix(i)(i)
  println(s"Top: $top")
  matrix(i)(i) = left
  //print(matrix(0)(i))
}

println(s"${matrix(0)(0)}${matrix(0)(1)}${matrix(0)(2)}")
println(s"${matrix(1)(0)}${matrix(1)(1)}${matrix(1)(2)}")
println(s"${matrix(2)(0)}${matrix(2)(1)}${matrix(2)(2)}")