object Solution {
  def isNStraightHand(hand: Array[Int], W: Int): Boolean = {
    if(hand.length == 0) true
    else if(hand.length%W == 0) {
      val min = hand.min
      val range = (min to min+W-1).toList
      println(s"Range: $range")
      println(s"Filtered Hand: ${hand.diff(range).toList}")
      isNStraightHand(hand.diff(range),W)
    }
    else false

  }


}


Solution.isNStraightHand(Array(1,2,3,6,2,3,4,7,8),3)