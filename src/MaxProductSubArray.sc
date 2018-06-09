object Solution {
  def maxProduct(nums: Array[Int]): Int = {
    val result = Array.fill(nums.length)(Array(0,0))
    if(nums.length < 1) 0
    else {
      result(0)(0) = nums(0)
      result(0)(1) = nums(0)
      for(i <- 1 to nums.length-1) {
        val allValues = nums(i) :: result(i-1).map(_*nums(i)).toList
        result(i)(0) = allValues.max
        result(i)(1) = allValues.min//allValues.foldLeft(0){(a,b) => if(Math.abs(a) > Math.abs(b)) a else b}
      }
      println(s"Array: ${result.flatten.toList}")
      result.flatten.max
    }

  }
}