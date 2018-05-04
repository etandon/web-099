object Solution {
  def multiply(num1: String, num2: String): String = {
    if(num1 == "0" || num2 == "0") return "0"
    var num2Len = num2.length
    var num1Len = num1.length
    var resultList = List[String]()
    for(i <- 0 to num2Len-1) {
      //println(num2(num2Len-1-i).toString.toInt)
      var resulti = ""
      var carry = 0
      for(j <- 0 to num1Len-1){
        //println(num1(num1Len-1-j).toString.toInt)
        var result = (num1(num1Len-1-j).toString.toInt * num2(num2Len-1-i).toString.toInt)+ carry
        if(result.toString.length > 1) {
          carry = result/10
          resulti =  (result%10).toString + resulti
        }
        else {
          carry=0
          resulti =  (result).toString + resulti
        }
        //println(result)
      }
      resulti =  carry.toString + resulti + ("0") * i
      //println(s"Result: ${resulti}")
      resultList = resultList ++ List(resulti)
    }
    println(resultList)
    add(resultList).replaceFirst("^0*", "")

  }

  def add(list: List[String]): String = {
    var max =list.map(a => a.length).max
    //println(max)
    var carry = 0
    var result = ""
    for(i <- 0 to max-1){
      var sum = 0
      for(j <- 0 to list.length-1){
        var value = try
          list(j)(list(j).length - 1 - i).toString.toInt
          catch{
            case e: Exception => 0
          }
        //println(s"Value: $value")
        sum = sum + value
      }
      sum = sum + carry
      println(s"Sum: $sum")
      if(sum.toString.length > 1) {
        carry = sum/10
        result =  (sum%10).toString + result
      }
      else {
        carry=0
        result =  (sum).toString + result
      }
    }
    result
  }
}

Solution.multiply("1234","123456789")