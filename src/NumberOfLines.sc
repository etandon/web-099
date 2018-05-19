object Solution {
  val letter = Range(97,123).map(a => a.toChar).toList
  def numberOfLines(widths: Array[Int], S: String): Array[Int] = {
    val map: Map[Char,Int] = (letter zip widths).toMap
    println(s"Map: $map")
    val result = Array(0,0)
    var total = 0
    for(s <- S.toCharArray){
      total += map.get(s).getOrElse(0)
    }
    if(total%100 == 0) result(0) = total/100
    else {
      result(1) = total%100
      result(0) = (total/100)+1
    }

    result
  }
}

val widths = Array(
  10,10,10,10,10,
  10,10,10,10,10,
  10,10,10,10,10,
  10,10,10,10,10,
  10,10,10,10,10,
  10)
Solution.numberOfLines(widths, "asbc")