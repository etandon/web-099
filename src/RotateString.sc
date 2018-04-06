def rotateString(A: String, B: String): Boolean = {
  if(A.length == 0 && B.length ==0) true
  else {
    var result = false
    for (i <- 1 to A.length) {
      if (s"${A.splitAt(i) _2}${A.splitAt(i) _1}" == B)
        result = true
    }
    result
  }
}