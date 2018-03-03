def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
  val short = if(nums1.length < nums2.length) nums1 else nums2
  val long = if(nums1.length < nums2.length) nums2 else nums1
  val m = short.length
  val n = long.length
  val medianPointShort = if (m%2 == 0) n/2 else (n-1)/2
  if(m == 0 || n == 0 ) {
    if(m == 0) {
      if (long.length%2 == 0) (long(n/2).toDouble + long((n/2)-1).toDouble)/2
      else long((n-1)/2).toDouble
    }
    else {
      if (short.length%2 == 0) (short(m/2).toDouble + short((m/2)+1).toDouble)/2
      else short((m-1)/2).toDouble
    }
  }
  else
  findPivot(short, long,medianPointShort)
}

def findPivot(short: Array[Int], long: Array[Int],medianPointShort: Int):Double = {
  val m = short.length
  val n = long.length
  val (s1,s2) = short.splitAt(medianPointShort)
  println(s"${s1.toList} ${s2.toList}")
  val medianPointLong = ((m-medianPointShort) - medianPointShort + n)/2
  val (l1,l2) = long.splitAt(medianPointLong)
  println(s"${l1.toList} ${l2.toList}")
  val param1 = findMax(s1.lastOption,l1.lastOption)
  val param2 = findMin(s2.headOption,l2.headOption)
  println(s"Param 1: ${param1}")
  println(s"Param 2: ${param2}")
  if (param1 <= param2) {
    println(s"Pivot Found ${m+n}")
    if((m+n)%2 == 0) {
      println("Even length")
      val result = (param1.toDouble + param2.toDouble)/2
      println(s"Result: ${result}")
      result
    }
    else param2
  }
  else if(s2.length == 1 && (s1.lastOption.getOrElse(Int.MinValue) < l1.lastOption.getOrElse(Int.MinValue))) findPivot(short, long,medianPointShort+1)
  else if(s2.length == 1 && (s1.lastOption.getOrElse(Int.MinValue) > l1.lastOption.getOrElse(Int.MinValue))) findPivot(short, long,medianPointShort-1)
  else 0.0
}

def findMax(t1 : Option[Int],t2: Option[Int]) = {
  (t1,t2) match {
    case (None, Some(s2)) => s2
    case (Some(s1), None) => s1
    case (Some(s1), Some(s2)) => math.max(s1,s2)
    case _ => Int.MaxValue
  }

}

def findMin(t1 : Option[Int],t2: Option[Int]) = {
  (t1,t2) match {
    case (None, Some(s2)) => s2
    case (Some(s1), None) => s1
    case (Some(s1), Some(s2)) => math.min(s1,s2)
    case _ => Int.MinValue
  }

}

//val nums1 = Array[Int](1,3)
//val nums2 = Array[Int](2)

//val nums1 = Array[Int](3,4)
//val nums2 = Array[Int](1,2)

//val nums1 = Array[Int](1,2)
//val nums2 = Array[Int](3,4)

val nums1 = Array[Int]()
val nums2 = Array[Int](2,3)

findMedianSortedArrays(nums1, nums2)


