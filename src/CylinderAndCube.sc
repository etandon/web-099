import scala.collection.immutable.ListMap

def maximumPackages(S: Array[Int], K: Array[Int], R: Array[Int], C: Array[Int]): Int = {
  val packageMap =(K zip S).toMap
  val cylinderMap = (C.map(_*1.43) zip R).toMap
  val sortedpackageMap =ListMap(packageMap.toSeq.sortWith(_._1 > _._1):_*)
  val sortedCylinderMap = ListMap(cylinderMap.toSeq.sortWith(_._1 > _._1):_*)
  1
}

def finalCount(packageMap: ListMap[Double,Int],cylinderMap: ListMap[Double,Int],count: Int): Int = {
  if(packageMap.isEmpty || cylinderMap.isEmpty) count
  else {
    val package1 = packageMap.head
    val cylinder1 = cylinderMap.head
    if((package1._1 < cylinder1._1))
      finalCount(packageMap,cylinderMap,count +1)
    else
      finalCount(packageMap,cylinderMap,count +1)
  }

}

val S = List(1,2,5,3)
val K = List[Double](1,2,10,3)

val R = List(1,2,9,4)
val C = List(1,2,3,4).map(_*1.43)


val packageMap =(K zip S).toMap
val cylinderMap = (C.map(_*1.43) zip R).toMap
val sortedpackageMap =ListMap(packageMap.toSeq.sortWith(_._1 > _._1):_*)
val sortedCylinderMap = ListMap(cylinderMap.toSeq.sortWith(_._1 > _._1):_*)

val l1 = List(1,2,3,4,5,110,2)
val l2 = List('a','b','v','f','g','j','i')
(l1 zip l2).toMap.toSeq.sortWith(_._1>_._1)


