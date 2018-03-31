def maxMin(operations: Array[String], x: Array[Int]): Array[Long] = {
  val result = Array.fill[Long](operations.length)(0)
  var list = List[Int]()
  for(i <- 0 to operations.length-1){
    operations(i) match{
      case "push" => list = addToList(list,x(i))
      case "pop"  => list = removeFromList(list,x(i))
    }
    println(s"$i: ${list}")
    result(i) = if(!list.isEmpty) list(0).toLong * list.last.toLong else 1
  }
  result
}

def addToList(list:List[Int],i:Int):List[Int]= {
  if(list.isEmpty) List(i)
  else {
    list.filter(a => a <= i) ::: List(i) ::: list.filter(a => a > i)
  }
}

def removeFromList(list:List[Int],i:Int):List[Int]= {
  var index = list.indexOf(i)
  list.splitAt(index)._1 ::: list.splitAt(index+1)._2
}

maxMin(Array[String]("push","push","push","pop"), Array[Int](1000000000,1000000000,3,3)).toList


List(100,100,3).splitAt(2)
