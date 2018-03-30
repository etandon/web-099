def searchInsert(nums: Array[Int], target: Int): Int = {
  if(nums.length == 0 ) 0
  else {
    var i = 0
    while(i < nums.length && nums(i) < target)
      i +=1
  i
  }
}


searchInsert(Array(1,3,5,6), 0)