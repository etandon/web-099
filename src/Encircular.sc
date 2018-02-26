def doesCircleExist(commands: Array[String]): Array[String] = {
 val result = Array.fill(commands.length){""}
  for(i <- 0 to (commands.length-1)) {
    result(i) = circleExists(commands(i))
  }
  result
}

def circleExists(command: String): String = {
  val init = Array[Int](0,0)
  var movement = 'F'
  for(i <- 0 to (command.length()-1)) {
    if (command(i) == 'L') {
      if (movement == 'N') movement = 'W'
      else if (movement == 'S') movement = 'E'
      else if (movement == 'E') movement = 'N'
      else if (movement == 'W') movement = 'S'
    }
    else if (command(i) == 'R') {
      if (movement == 'N') movement = 'E'
      else if (movement == 'S') movement = 'W'
      else if (movement == 'E') movement = 'S'
      else if (movement == 'W') movement = 'N'
    }
    else {
      if (movement == 'N') init(1) = init(1) + 1
      else if (movement == 'S') init(1) = init(1) - 1
      else if (movement == 'E') init(0) = init(0) + 1
      else if (movement == 'W') init(0) = init(0) - 1
    }
  }
    if ((init(0) == 0) && (init(1) ==0)) "YES"
    else "NO"


}

circleExists("G")
circleExists("L")
circleExists("GRGL")
