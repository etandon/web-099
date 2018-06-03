object Solution {
  def longestMountain(A: Array[Int]): Int = {
    if(A.length<3) 0
    else {
      val zip = (leftSet(A) zip rightSet(A)).toList
      println(zip)
      val nonZeroZip=zip.filter(a => a._1 >0 && a._2>0)
      val result = if(nonZeroZip.length>0)
        nonZeroZip.map(a => a._1 + a._2).max + 1
      else 0

      if(result <3) 0 else result
    }

  }

  def leftSet(l: Array[Int]): Array[Int] = {
    val result = Array.fill(l.length)(0)
    var zip  = (l zip result)
    //println(s"Map: ${zip}")
    for(i <- 1 to zip.length-1){
      val split = (zip.splitAt(i)._1).filter((a => a._1 < l(i)))
      //println(s"Split: ${split}, Split Max:${if(!split.isEmpty) (split.unzip._2.max)+1 else 0}")
      //println(s"i: $i,l(i): ${l(i)}")
      zip(i) = (zip(i)._1,if(!split.isEmpty) (split.unzip._2.max)+1 else 0)
    }
    zip.unzip._2
  }

  def rightSet(l: Array[Int]): Array[Int] = {
    leftSet(l.reverse).reverse
  }

}

//Solution.leftSet(Array(2,1,4,7,3,2,5))
//Solution.longestMountain(Array(2,1,4,7,3,2,5))
//Solution.longestMountain(Array(2,2,2))
Solution.longestMountain(Array(0,1,2,3,4,5,6,7,8,9))
//zip.filter((a => a._1 < l(i))


