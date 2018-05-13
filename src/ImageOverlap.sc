object Solution {
  def largestOverlap(A: Array[Array[Int]], B: Array[Array[Int]]): Int = {
    if(!A.flatten.contains(1)) {
      println("End Case")
      0
    }
    else{
      println(A(0).toList)
      println(A(1).toList)
      println(A(2).toList)
      println("-----------------------------------")

      var o1 = calcOverlap(A,B)
      println(o1)
      var o2 = 0//largestOverlap(operation(A,"L"),B)
      println(o2)
      var o3 = 0//largestOverlap(operation(A,"U"),B)
      println(o3)
      var o4 = largestOverlap(operation(A,"D"),B)
      println(o4)
      var o5 = largestOverlap(operation(A,"R"),B)
      println(o5)
      Math.max(Math.max(Math.max(o1,o2),Math.max(o3,o4)),o5)
    }

  }
  def calcOverlap(A: Array[Array[Int]], B: Array[Array[Int]]): Int ={
    var result = 0
    for(i <- 0 to A.length-1; j <- 0 to A(0).length-1 ){
      if(A(i)(j)==1 && B(i)(j)==1)
        result +=1
    }
    result
  }
  def operation(Ai: Array[Array[Int]],operation: String): Array[Array[Int]] = {
    var result = Ai
    operation match {
      case "U" => {
        for(i <- 0 to result.length-2){
          result(i) = result(i+1)
        }
        var length =(result.length-1)
        result(length) = Array.fill(length+1)(0)
        result
      }
      case "D" => {
        for(i <- 0 to result.length-2){
          result(result.length-1-i) = result(result.length-2-i)
        }
        var length =(result.length-1)
        //println(A(0).toList)
        //println(A(1).toList)
        //println(A(2).toList)
        result(0) = Array.fill(length+1)(0)
        result
      }
      case "L" => {
        for(i <- 0 to result.length-1;j<- 0 to result.length-1){
          if(j== result.length-1) result(i)(j)=0
          else result(i)(j) = result(i)(j+1)
        }
        //println(A(0).toList)
        //println(A(1).toList)
        //println(A(2).toList)
        result
      }
      case _ => {
        for(i <- 0 to result.length-1;j<- 0 to result.length-1){
          //println(s"i:$i,j:$j")
          if(result.length-j-1== 0) result(i)(0)=0
          else result(i)(result.length-j-1) = result(i)(result.length-j-2)
        }
        //println(A(0).toList)
        //println(A(1).toList)
        //println(A(2).toList)
        result
      }
    }

  }

}

var A = Array(
              Array(1,1,0),
              Array(0,1,0),
              Array(0,1,0)
              )
var B = Array(
              Array(0,0,0),
              Array(0,1,1),
              Array(0,0,1)
              )

//Solution.operation(A,"U").flatten
//Solution.operation(A,"D").flatten
//Solution.operation(B,"L").flatten
//Solution.operation(A,"R").flatten

Solution.largestOverlap(A,B)

