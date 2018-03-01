def twoSum(nums: List[Int], target: Int, result: Array[Int],wholeArray: Array[Int] ): Array[Int] = {
  if(!result.contains(-1)) result
  else {
    nums match {
      case head :: rest => if (rest.contains(target-head)){
        val i1 = wholeArray.indexOf(head)
        val i2 = (wholeArray.splitAt(i1+1)._2.indexOf(target-head))+i1

        twoSum(rest,target,Array[Int](i1,i2),wholeArray)
      }
        else
        twoSum(rest,target,result,wholeArray)
      case _ => result

    }
  }

}


val nums = Array(2,7,11,15)
val target = 9

twoSum(nums.toList,target,Array(-1,-1),nums).toList



