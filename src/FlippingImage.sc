object Solution {
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    for(i <- 0 to A.length-1)
      A(i) = A(i).reverse
    for(j <- 0 to A.length-1;k <- 0 to A.length-1){
      if (A(j)(k)==0) A(j)(k) =1
      else A(j)(k) =0
    }
    A
  }
}

var A = Array(
  Array(1,1,0),
  Array(0,1,0),
  Array(0,1,0)
)
var B = Array(
  Array(0,0,0),
  Array(0,1,1),
  Array(0,0,1)
)

Solution.flipAndInvertImage(B).flatten