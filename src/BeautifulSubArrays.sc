def beautifulSubarrays(a: Array[Int], m: Int): Long = {
  var result:Long = 0
  val map = oddsMap(a)
  for(i <- 0 to (a.length-1)) {
    for(j <- i+1 to (a.length)) {
      if (((map.splitAt(i)._2).splitAt(j-i)._1).sum == m) result +=1
    }
  }
  result
}

def findNumberOfOdds(l: List[Int]): Int = {
  l.filter(a => a%2 ==1).size
}

def oddsMap(l: Array[Int]): Array[Int] = {
  l.map(a => if(a%2 ==1) 1 else 0)
}

findNumberOfOdds(List(1,2,3,4,5))
oddsMap(Array(1,2,3,4,5))

//beautifulSubarrays(Array(1,2,3,4,5), 1)

beautifulSubarrays(Array(2,5,4,9), 0)