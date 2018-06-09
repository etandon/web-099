object Solution {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    var result = 0
    for(i <- 0 to 2; j <- 1 to 2){
      val split = (nums.splitAt(i)._2).splitAt(j-i+1)._1
      if(split.foldLeft(0)(_ + _) == k) result +=1
    }
    result
  }
}

Solution.subarraySum(Array(1,1,1),2)