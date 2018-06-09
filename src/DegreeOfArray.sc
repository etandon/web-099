object Solution {
  def findShortestSubArray(nums: Array[Int]): Int = {
    var maxFrequency = Int.MinValue
    val freq = findFrequency(nums)
    for((k,v) <- freq)
      maxFrequency = Math.max(v, maxFrequency)
    val maxArray = (freq.filter(a => a._2 == maxFrequency)).keys.toArray
    findLength(nums,maxArray).min

  }

  def findFrequency(nums: Array[Int]): Map[Int,Int] = nums.groupBy(a => a).mapValues(_.size)

  def findLength(nums: Array[Int], maxArray: Array[Int]): Array[Int] = {
    val result = Array.fill(maxArray.length)(0)
    for(i <- 0 to maxArray.length-1)
      result(i) = nums.lastIndexOf(maxArray(i)) - nums.indexOf(maxArray(i)) + 1
    result
  }

}