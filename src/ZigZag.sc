import scala.collection.immutable.ListMap

object Solution {
  def convert(s: String, numRows: Int): String = {
    val result: Array[String] =Array.fill[String](numRows)("")
    for(i <- 1 to numRows) {
      result(i-1) = findRow(s, i, numRows)
    }
    result.mkString
  }
  def findRow(s: String, row: Int, numRows: Int):String = {
    val sMap = s.zipWithIndex
    val divisor = (numRows-1)*2
    if(row == 1) {
      sMap.filter(m => (m._2%(divisor))==0).unzip._1.mkString
    }
    else if(row == numRows) {
      sMap.filter(m => (m._2%(divisor))==(numRows-1)).unzip._1.mkString
    }
    else {
      (sMap.filter(m => (m._2%(divisor))==(row-1)) ++ sMap.filter(m => (m._2%(divisor))==(divisor-row+1))).sortWith(_._2 < _._2).unzip._1.mkString

    }
  }

}

Solution.findRow("PAYPALISHIRING",1,3)
Solution.findRow("PAYPALISHIRING",2,3)
Solution.findRow("PAYPALISHIRING",3,3)

Solution.convert("PAYPALISHIRING",3)
