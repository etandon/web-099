object Solution {
  def longestPalindrome(s: String): String = {
    var longest = ""
    for(i <- 0 to (s.length-1)) {
//      println(i)
      val longestTemp1 = longestAroundIndex(s,i,i)
      val longestTemp2 = if(i==(s.length-1)) "" else longestAroundIndex(s,i,i+1)
      val longestTemp = if(longestTemp1.length > longestTemp2.length) longestTemp1 else longestTemp2
      if(longestTemp.length > longest.length) longest = longestTemp
   }
    longest
  }

  def longestAroundIndex(s: String,index1: Int,index2:Int):String = {
    var i=0
    var prev:String =s(i).toString
    while((index1-i)>=0 && (index2+i)<=(s.length-1)) {
//      println(i)
//      println(s"Index: $index")
      if(s(index1-i) == s(index2+i)) {
        prev = s.substring(index1-i,index2+i+1)
        i = i+1
      }
      else return prev
    }
    prev
}
}


//Solution.longestAroundIndex("babad",0,0)
//Solution.longestAroundIndex("babad",1,1)
//Solution.longestAroundIndex("babad",2,2)
//Solution.longestAroundIndex("babad",3,3)
//Solution.longestAroundIndex("babad",4,4)
//Solution.longestPalindrome("babad")

Solution.longestAroundIndex("cbbd",0,0)
Solution.longestAroundIndex("cbbd",1,2)
Solution.longestPalindrome("cbbd")


