def compression(s1: String):String = {
  headReplacer(s1.toList,"")
}

def headReplacer(list: List[Char],result: String):String ={
  list match {
    case Nil => result
    case head :: rest =>
      val brokenLists = list.span(a => a == head)
      headReplacer(brokenLists._2,s"${result}${head.toString}${brokenLists._1.length}")
  }
}

val s1 = "aaaaaaaabgvvvvvvdf"

headReplacer(s1.toList,"")

