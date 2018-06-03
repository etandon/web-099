object Solution {
  def backspaceCompare(S: String, T: String): Boolean = {
    backspace(S) == backspace(T)
  }

  def backspace(S: String): String = {
    if(!S.contains('#')) S
    else if(S.startsWith("#")) backspace(S.splitAt(1)._2)
    else {
      val index = S.indexOf('#')
      println(s"Index: $index, S:$S")
      val (head,tail) = S.splitAt(index)
      println(s"Head: ${head},Tail: ${tail}")
      val result = s"${head.splitAt(head.length-1)_1}${tail.splitAt(1)._2}"
      println(s"Result: $result")
      backspace(result)
    }

  }
}

Solution.backspace("###test##")