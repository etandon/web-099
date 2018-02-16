def anagramDeletion(s1: String, s2: String): Int ={
  val s1Set = (s1.toList).groupBy(i=>i).mapValues(_.size)
  val s2Set = (s2.toList).groupBy(i=>i).mapValues(_.size)
  val aggregation = (s1Set.keySet ++ s2Set.keySet).map(key => (key,(s1Set.get(key).getOrElse(0) - s2Set.get(key).getOrElse(0)))).toList
  sumAbsolute(aggregation ,0)
}


def sumAbsolute(aggr: List[(Char, Int)] ,count: Int):Int ={
  aggr match {
    case Nil => count
    case (c: Char, i :Int) :: rest =>
      val sum = ( if (i > 0) i else (-1*i)) + count
      sumAbsolute(rest,( if (i > 0) i else (-1*i)) + count )
  }
}

anagramDeletion("awqeqweqw","aeqwqew")


("1234567890001").toList.groupBy(a => a).mapValues(_.size)

Map('a' -> 1, 'b' -> 10).mapValues(a => 5 * a)

