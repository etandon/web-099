object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    val maxArray = Array.fill(nums.length)(0)
    if(nums.length < 1) 0
    else {
      maxArray(0) = nums(0)
      for(i <- 1 to nums.length-1)
        maxArray(i) = Math.max(nums(i),nums(i) + maxArray(i-1))
      maxArray.max

    }

  }
}