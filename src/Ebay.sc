object Solution {

  def permutations(s: String):List[String] = {
    val len = s.length
    if(len == 0) return Nil
    if(len == 1) return List(s)
    else {
      var result:List[String] = Nil
      for(i <- 0 to s.length-1) {
        //println(s"i:$i")
        //println(s.toCharArray.toList)
        var stringAfterRemovedChar:List[Char]  = s.toCharArray().toList.filter(a => a!= s(i))
        //println(s"${stringAfterRemovedChar.mkString}")
        result = result  ++ permutations(stringAfterRemovedChar.mkString).map(a => s"${s(i)}$a")
      }
      return result
    }
  }

  //println(Solution.permutations(""))

  //println(Solution.permutations("abc"))



}

Solution.permutations("abc")