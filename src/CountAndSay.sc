import scala.collection.immutable.ListMap

case class holder(i: Int,c: Char) {
  override def toString = s"$i$c"
}

def countAndSay(n: Int): String = {
  var str = n.toString
  if(str.length == 0 ) ""
  else if(str.length == 1) s"1${n.toString}"
  else {
    var last = str(0)
    var count = 1
    var result = List[holder]()
    for (i <- 1 to str.length - 1) {
      println(s"Curr: ${str(i)}, Last: ${last},Count: ${count}")
      if (str(i) == last) {
        count += 1
      }
      else {
        println(s"$i")
        result = result ++ List(holder(count,last))
        println(s"Else: ${result}")
        last = str(i)
        count = 1
      }
    }
    //println(s"Last: $last")
    //println(s"Last Count: $count")
    println(s"Last: ${result}")
    result = result ++ List(holder(count,last))
    (result).mkString
  }
}

countAndSay(11123)


