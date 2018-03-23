def rob(nums: Array[Int]): Int = {
  if(nums.length == 0) 0
  else {
    val booty = Array.fill[Int](nums.length+1)(0)
    booty(1) = nums(0)
    for(i <- 2 to nums.length){
      booty(i) = math.max(nums(i-1)+booty(i-2),booty(i-1))
    }
    println(s"Booty:${booty.toList}")
    booty.last
  }

}


val arr = Array(104,209,137,52,158,67,213,86,141,110,151,127,238,147,169,138,240,185,246,225,147,203,83,83,131,227,54,78,165,180,214,151,111,161,233,147,124,143)

val arr1 = Array(1,2,3,4,5)

rob(arr1)