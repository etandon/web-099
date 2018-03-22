def find132pattern(nums: Array[Int]): Boolean = {
  val leftMin = Array.fill[Int](nums.length)(Int.MaxValue)
  var min = Int.MaxValue
  for(i <- 0 to nums.length-1){
    if(i!=0){
      min = Math.min(min,nums(i-1))
      leftMin(i) = min
    }
  }
  println(s"Left Min: ${leftMin.toList}")
  val rightMaxLessThanCurrent = Array.fill[Int](nums.length)(Int.MinValue)
  var max = Int.MinValue
  for(i <- 1 to nums.length-1){
     if(i != 0){
       max = Math.max(max,if (nums(nums.length-i-1)>nums(nums.length-i)) nums(nums.length-i) else max)
       rightMaxLessThanCurrent(nums.length-i-1) = max
     }
  }
  println(s"Right Max: ${rightMaxLessThanCurrent.toList}")
  var result = false
  for(i <- 0 to nums.length-1){
    if((leftMin(i) < rightMaxLessThanCurrent(i)) && (leftMin(i) < nums(i)) && (nums(i) > rightMaxLessThanCurrent(i)) && (rightMaxLessThanCurrent(i)!=Int.MinValue)) {
      println(s"Index: $i")
      result = true
    }
  }
  result
}


find132pattern(Array[Int](1,2,3,4))

find132pattern(Array[Int](1,0,1,-4,-3))

find132pattern(Array[Int](3,5,0,3,4))