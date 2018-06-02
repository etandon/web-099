object Solution {
  def numMagicSquaresInside(grid: Array[Array[Int]]): Int = {

    0
  }

  def constructSquare(k: Int,l: Int, grid: Array[Array[Int]], count: Int): Int ={
    val square = Array.fill(3)(Array.fill(3)(0))
    println(s"k: $k, l:$l")
    for(j <- l to l+2;i <- k to k+2) {
       println(s"i: $i, j: $j")
       square(j-l)(i-k) = (grid(j)(i))

    }
    if(k < grid(0).length-2)
      constructSquare(k+1, l, grid, if(isMagicSquare(square)) count+1 else count)
    else if(l < grid.length-3)
      constructSquare(0, l+1, grid, if(isMagicSquare(square)) count+1 else count)
    else
     if(isMagicSquare(square)) count+1 else count
  }

  def isMagicSquare(grid: Array[Array[Int]]): Boolean = {
    val sum = grid(0).sum
    (sum == grid(1).sum) &&
      (sum == grid(2).sum) &&
      (sum == grid.map(a => a(0)).sum) &&
      (sum == grid.map(a => a(1)).sum) &&
      (sum == grid.map(a => a(2)).sum) &&
      (sum == grid(0)(0) + grid(1)(1) + grid(2)(2) &&
      (sum == grid(0)(2) + grid(1)(1) + grid(2)(0)))
  }
}

val input = Array(
  Array(4,3,8,4),
  Array(9,5,1,9),
  Array(2,7,6,2)
)

Solution.constructSquare(0,0,input,0)
