def isPalindrome(x: Int): Boolean = {
  var result = true
  println(x.toString.length/2)
  for(i <- 0 to (x.toString.length/2)){
    if(x.toString.charAt(i) != x.toString.charAt(x.toString.length-i-1)) result = false
  }
  result
}

isPalindrome(100)