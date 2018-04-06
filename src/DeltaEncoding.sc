def delta_encode(array: Array[Int]): Array[Int] = {
  if(array.length < 1) Array()
  else {
    var result = List(array(0))
    var last = array(0)
    for(i <- 1 to array.length-1 ){
      var diff = array(i) - last
      if(diff > 127 || diff < -127) result = result ::: List(-128)
      result = result ::: List(diff)
      last = array(i)
    }

    result.toArray
  }
}


delta_encode(Array[Int](25626,25757,24367,24267,16,100,2,7277)).toList