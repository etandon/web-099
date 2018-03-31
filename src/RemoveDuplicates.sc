def removeDuplicates(nums: Array[Int]): Int = {
  var prev = Int.MinValue
  var count = 0
  for(i <- 0 to nums.length-1){
    if(nums(i)!= prev) {
      prev = nums(i)
      count +=1
    }
  }
  count
}

removeDuplicates(Array[Int](1,1,2))