def findRepeatedDnaSequences(s: String): List[String] = {
  var result = List[String]()
  if(s.length < 11) return result
  else {
    for(i <- 0 to s.length-1-10){
      println(s.substring(i,i+10))
      if(s.substring(i+1).contains(s.substring(i,i+10)) && !result.contains(s.substring(i,i+10))) result = s.substring(i,i+10) :: result
    }
    result
  }

}

findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")

findRepeatedDnaSequences("AAAAAAAAAAA")

findRepeatedDnaSequences("AAAAAAAAAAAA")