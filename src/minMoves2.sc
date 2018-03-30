def minMoves2(nums: Array[Int]): Int = {
  val sum = nums.sum
  val count = nums.length
  val mean = (sum.toDouble/count.toDouble).round
  println(s"Sum: $sum")
  println(s"Mean: $mean")
  val sumLess = nums.filter(a => a < mean).sum
  val countLess = nums.filter(a => a < mean).length

  val sumMore = nums.filter(a => a > mean).sum
  val countMore = nums.filter(a => a > mean).length
  val result = (mean*countLess) - sumLess + (sumMore) - (mean * countMore)
  result.toInt
}


minMoves2(Array[Int](1,2,3,1))

