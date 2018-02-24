def howManyStudents(m: Int, c: Array[Int]): Array[Int] = {
  finalResult(0,m,Nil,c.toList.groupBy(a=> a).mapValues(_.size)).toArray
}

def finalResult(current: Int, end:Int, list: List[Int],map: Map[Int,Int]): List[Int] = {
  if(current < end)
    List(map.get(current).getOrElse(0)) ::: finalResult(current+1,end,list,map)
  else list
}

val list = List(2,2,0,2)
howManyStudents(3,list.toArray).toList



