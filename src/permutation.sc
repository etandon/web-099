def checkPermutation(s1: String,s2: String):Boolean ={
  val s1Map = s1.groupBy(a => a).mapValues(_.size)
  val s2Map = s2.groupBy(a => a).mapValues(_.size)
  val result = s2Map.map{
    case (k,v) => if(v <= s1Map.get(k).getOrElse(0)) true else false
  }
  !result.exists(_ == false)
}

checkPermutation("12345678","123")
checkPermutation("12345678","123v")

val s1 = "12345678"
val s2 = "123v"
val s1Map = s1.groupBy(a => a).mapValues(_.size)
val s2Map = s2.groupBy(a => a).mapValues(_.size)
val result = s2Map.map{
  case (k,v) => if(v <= s1Map.get(k).getOrElse(0)) true else false
}

