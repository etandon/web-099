import scala.collection.immutable.ListMap

def rob(nums: Array[Int]): Int = {
  if(nums.length == 0) 0
  else if(nums.length == 1) nums(0)
  else math.max(robArray(nums.tail),robArray(nums.splitAt(nums.length-1)._1))

}

def robArray(nums: Array[Int]): Int = {
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

//rob(Array[Int](1,2,3,4,5))

//rob(Array[Int](0))

//rob(Array[Int]())

//rob(Array[Int](1,2))

//rob(Array[Int](1,1,1,2))

rob(Array[Int](2,2,4,3,2,5))