
class Elevator() {
  var toVisit = List[Int]()
  var currentFloor = 0
  var direction: Option[String] = None
  def callElevator(floor: Int) = {
    toVisit = toVisit ::: List(floor)
    println(s"Stack: $toVisit")

  }
  def goto(floor: Int) = {
    toVisit = toVisit ::: List(floor)
    println(s"Stack: $toVisit")

  }

  def elevatorMovement(currentDirection: Option[String]):Option[String] = {
    println(s"Current Floor: $currentFloor")
    currentDirection match {
      case None => {
        var sortedVisit = toVisit.sorted
        println(s"Sorted: $sortedVisit")
        var prev = -1
        for(i <- 0 to sortedVisit.length-1) {
          if(sortedVisit(i) > currentFloor) {
            println("Direction found")
            direction = Some("U")
            println(s"direction: $direction")
            println(s"Reached floor: ${sortedVisit.head}")
            currentFloor =sortedVisit.head
            toVisit = toVisit.filter(a => a!=sortedVisit.head)
            println(s"Updated List: $toVisit")
            println(s"$currentFloor")
          }


        }
        direction
      }
      case Some("U") => {
        println("Case U")
        var sortedVisit = toVisit.sorted
        var found = false
        for(i <- 0 to sortedVisit.length-1){
          if(sortedVisit(i) > currentFloor) {
            found = true
            var nextLevel = sortedVisit(i)
            println(s"Next Level: ")
            toVisit = toVisit.filter(a => a!=nextLevel)
            println(s"UpdatedList: ${toVisit}")
            currentFloor =nextLevel
            println(s"Current Floor: ${currentFloor}")
          }
        }
        if(found) direction
        else None
      }
      case _ => None
    }

  }

}

val elev = new Elevator()
elev.callElevator(3)
elev.callElevator(2)
val direction = elev.elevatorMovement(None)
println(s"$direction")
println(s"command 1: $direction")
val direction1 = elev.elevatorMovement(direction)
elev.goto(1)
elev.goto(4)
val direction2 = elev.elevatorMovement(direction)
elev.elevatorMovement(direction2)

