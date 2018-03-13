def beautifulSubarrays(a: Array[Int], m: Int): Long = {
  var result:Long = 0
  for(i <- 0 to (a.length-1)) {
    for(j <- i+1 to (a.length)) {
      print(s"i: $i")
      print(s"j: $j")
      println((a.splitAt(i)._2).splitAt(j-i)._1.toList)
      if(findNumberOfOdds((a.splitAt(i)._2).splitAt(j-i)._1.toList) ==m) result +=1
    }
  }
  result
}

def findNumberOfOdds(l: List[Int]): Int = {
  l.filter(a => a%2 ==1).size
}

findNumberOfOdds(List(1,2,3,4,5))

//beautifulSubarrays(Array(1,2,3,4,5), 1)

beautifulSubarrays(Array(2,5,4,9), 2)