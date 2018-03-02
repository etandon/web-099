def lengthOfLongestSubstring(s: String): Int = {
  var result = 0
  var list = List[Char]()
  for(i <- 0 to s.length-1) {
    if(list.contains(s(i))) {
      result = math.max(result,list.length)
      var index = list.lastIndexOf(s(i))
      println(list)
      list = list.splitAt(index+1)._2 ::: List(s(i))
      println(list)
    }
    else {
      list =  list ::: List(s(i))
      result = math.max(result,list.length)
    }

  }

  result
}

//lengthOfLongestSubstring("abcabcbb")
//
//lengthOfLongestSubstring("bbbbb")
//
//lengthOfLongestSubstring("pwwkew")
//
//lengthOfLongestSubstring("p")

lengthOfLongestSubstring("dvdf")






