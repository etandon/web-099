def usernameDisparity(inputs: Array[String]): Array[Int] = {
  // Write your code here.
  val result = Array.fill(inputs.length){0}
  for(i <- 0 to (inputs.length-1)){
    for(j <- 0 to (inputs(i).length-1)) {
      println(s"Input: ${inputs(i)}")
      println(s"Input: ${inputs(i).toList.splitAt(j)._2.mkString("")}")
      result(i) = result(i) + calculateDisparity(inputs(i),inputs(i).toList.splitAt(j)._2.mkString(""))
    }

  }
 result
}



def calculateDisparity(s1: String,s2: String): Int = {
  var disparity =0
  var shortLength = if(s1.length >= s2.length) s2.length else s1.length
  for (i <- 0 to (shortLength-1)) {
    if (s1(i) == s2(i)) disparity = disparity +1
    else return disparity
  }
  disparity
}

usernameDisparity(Array("ababaa")).toList



