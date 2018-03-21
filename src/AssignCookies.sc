def findContentChildren(g: Array[Int], s: Array[Int]): Int = {
  var result = 0
  val sortedG = g.toList.sortWith(_ < _)
  val sortedS = s.toList.sortWith(_ < _)
  println(s"sortedG: $sortedG")
  println(s"sortedS: $sortedS")
  var i =0
  var j =0
  while((i < g.length) && (j < s.length)) {
    println(s"i:$i")
    println(s"j:$j")
    if(sortedG(i) <= sortedS(j)){
      println(s"If 1")
      result += 1
      i += 1
      j += 1
    }
    else if(sortedG(i) > sortedS(j)){
      println(s"If 2")
      while((j < s.length) && (sortedG(i) > (if(j < s.length) sortedS(j) else 0))){
        j += 1
        println(s"j2: $j")
        println(s"s.length: ${s.length}")
        println(s"Condition: ${j < s.length}")
      }
      if((j < s.length) && sortedG(i) <= sortedS(j)){
        result += 1
        i += 1
        j += 1
      }
    }
    else i+=1
  }
  result
}


//findContentChildren(Array[Int](6,2,5,1,4), Array[Int](6,9,1))
//findContentChildren(Array[Int](1,2,3), Array[Int](1,1))
//findContentChildren(Array[Int](1,2), Array[Int](1,2,3))
findContentChildren(Array[Int](1,2,3), Array[Int](1,1))