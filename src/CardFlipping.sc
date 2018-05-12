object Solution {
  def flipgame(fronts: Array[Int], backs: Array[Int]): Int = {
    if(fronts.length == 0) 0
    else {
      var mergeSet = (fronts ++ backs).toSet.toSeq.sorted
      println(mergeSet)
      var result = 0
      for(j <- 0 to mergeSet.length-1)
      {
        var count =0
        for (i <- 0 to fronts.length - 1) {
          if(fronts(i) == mergeSet(j) && backs(i) == mergeSet(j)){
            count +=1
          }
          if(count <=1) return mergeSet(j)

        }
      }
      result
    }

  }
}

Solution.flipgame(Array(1,2,4,4,7),Array(1,3,4,1,3))