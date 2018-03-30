def minMoves(nums: Array[Int]): Int = {
  if(nums.length < 2)  0
  else {
    var result =0
    val least = findLeast(nums)
    for(i <- 0 to nums.length-1){
      result = result + (nums(i)-least)
    }
    result
  }
}

def findLeast(nums: Array[Int]): Int = {
  var least = Int.MaxValue
  for(i <- 0 to nums.length-1){
    if(nums(i) < least) least = nums(i)
  }
  least
}

findLeast(Array[Int](1,2,3))
minMoves(Array[Int](1,2,3))
