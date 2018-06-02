// To execute Scala code, please define an object named Solution that extends App

object Solution extends App {

  //   def leastUnhapiness(list: List[Double]): Double = {
  //     for(i <- list ) {


  //     }
  //     0
  //   }

  def findUnhapiness(list: List[Double],current: Double,travelled: Double,path: List[Double]): Double = {
    val length = list.length
    if(length == 0) current
    else {
      val array: Array[Double, List[Double]] = Array.fill(length)(0.toDouble,Nil)
      for(i <- 0 to  length-1) {
        val unhapiness = Math.abs(50-(list(i)-travelled))
        println(s"unhapiness: $unhapiness")
        println(s"travelled: $travelled")
        println(s"Split: ${list.splitAt(i+1)}")
        array(i) = findUnhapiness(list.splitAt(i+1)._2,current + unhapiness,list(i),path ++ List(list(i)),path ++ List(list(i)))

      }
      println(array.toList)
      array.toList.min
    }

  }



  //println(findUnhapiness(List[Double](0, 20, 40, 75, 100),0,0))
  println(findUnhapiness(List[Double](0, 40,100),0,0,Nil))
}

/**
stops = [0, 40, 100]
-> 10

unhapiness: 30.0
travelled: 0.0
Split: (List(0.0, 20.0),List(40.0, 75.0, 100.0))

unhapiness: 45.0
travelled: 20.0
Split: (List(40.0, 75.0),List(100.0))

0 -> 20 (penalty 30), 20 -> 40 (penalty 5) . Total penalty so far is 35

0 -> 20 (penalty 30), 20 -> 75 (penalty 5) . Total penalty so far is 35

List(0.0)
unhapiness: 70.0
travelled: 20.0
Split: (List(40.0, 75.0, 100.0),List())
List(0.0, 0.0, 100.0)
unhapiness: 10.0
travelled: 0.0
Split: (List(0.0, 20.0, 40.0),List(75.0, 100.0))
unhapiness: 90.0
travelled: 40.0
Split: (List(75.0, 100.0),List())
List(0.0, 100.0)
unhapiness: 25.0
travelled: 0.0
Split: (List(0.0, 20.0, 40.0, 75.0),List(100.0))
List(0.0)
unhapiness: 50.0
travelled: 0.0
Split: (List(0.0, 20.0, 40.0, 75.0, 100.0),List())
List(0.0, 0.0, 0.0, 0.0, 50.0)
0.0
8
  */

/*
Your previous Java content is preserved below:

import java.io.*;
import java.util.*;

class Solution {

  /**
 You're driving on vacation with your girlfriend (or boyfriend) to some destination
  but she likes to travel exactly 50 miles a day if possible - more or less are equally
  bad. There happens to be a perfectly straight perfectly maintained road, and rest
  stops are all along it. You are point 0 and the road takes you straight to the destination.
  You have a perfect Tesla (so you never worry about gas) and Allstate insurance
  (so you know you are in good hands) so the only thing you worry about minimizing your significant other's unhappiness during the drive there.

  A path is a series of stops, and when you move from one stop to another you incur the unhappiness penalty of unhappiness(distance_traveled) = | distance_traveled - 50 |
  for each leg of the trip.
  How can you find a path that makes this trip (from 0 to the destination, the furthest stop) as least unenjoyable as possible?

  @param stops a list of stops List[Double] (a stop is defined by the distance along the road from origin, 0), the furthest stop is the destination. The list will always contain 0 and another stop > 0 (the furthest stop from 0 being the destination).

  @example
  {{{
  stops= [0, 20, 40, 75, 100]


  Notation of the below segments: start -> stop (unhappiness penalty)
  Go. 0->20 (30), 20->75 (5), 75->100 (25) COST of this path = 30 + 5 + 25 = 60

  Go. 0-100 (|100-50| = 50) Cost of this path = 50
  ...
  the best path is actually 0->40, 40->100 where the path costs = 10+10 = 20
  Return [0,40,100]

  @return the optimal path (least penalty)
  }}}
  **/
  public List<Double> leastUnenjoyableSolution(List<Double> stops) {
    return null;
  }

  public static void main(String[] args) {
    ArrayList<Double> stops = new ArrayList<>();
    stops.add(0.0);
    stops.add(20.0);
    stops.add(100.0);

  }
}
 */