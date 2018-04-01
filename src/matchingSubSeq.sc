def numMatchingSubseq(S: String, words: Array[String]): Int = {
  var count =0
  for(i <- 0 to words.length-1) {
    println(s"${S.contains(words(i))}")
    if(subsequence(S,words(i))) count +=1
  }
  count
}

def subsequence(s1:String,s2:String): Boolean = {
  if(s1 == null || s2 ==null) false
  if(s2.length > s1.length) false
  if(s2.length == 1) s1.contains(s2)
  else {
    var j =0
    for(i <- 0 to s1.length-1){
      println(s"i: $i,j: $j")
      if(j < s2.length) {
        if (s1(i) == s2(j)) j += 1
      }
    }
    j == s2.length
  }

}

numMatchingSubseq("abcde", Array[String]("a","bb","acd","ace"))

subsequence("abcde","a")
subsequence("abcde","bb")
subsequence("abcde","acd")
subsequence("abcde","ace")