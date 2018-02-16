def notePossible(mag: Array[String],ransom: Array[String]): Boolean = {
  val magDict = mag.toList.groupBy(a=>a).mapValues(_.size)
  val noteDict = ransom.toList.groupBy(a=>a).mapValues(_.size)
  val result =(noteDict.keySet).map(key => (noteDict.get(key).getOrElse(0) - magDict.get(key).getOrElse(0)))
  result.exists(a => a >0)
}

