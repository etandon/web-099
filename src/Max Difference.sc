def maxDifference(a: Array[Int]): Int = {
  var result = Int.MinValue
  for(i <- 1 to a.length-1) {
    if((a(i-1)-a(i)) > result) {
      result = (a(i-1)-a(i))
    }
  }
  result
}

maxDifference(Array(2,3,10,2,4,8,1))

maxDifference(Array(7,9,5,6,3))