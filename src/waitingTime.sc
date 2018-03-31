def waitingTime(tickets: Array[Int], p: Int): Long = {
  if(tickets(p) == 0) 0
  else {
    var result:Long = 0
    for (i <- 0 to p) {
      if (tickets(i) <= tickets(p))
        result += tickets(i).toLong
      else result += tickets(p).toLong
    }

    for (i <- p + 1 to tickets.length - 1) {
      if (tickets(i) <= tickets(p) - 1)
        result += tickets(i).toLong
      else result += tickets(p).toLong - 1
    }

    result
  }
}

waitingTime(Array[Int](5,5,2,3), 3)