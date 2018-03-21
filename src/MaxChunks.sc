def maxChunksToSorted(arr: Array[Int]): Int = {
  var result = 0
  var prev = Int.MinValue
  for(i <- 0 to arr.length-1){
    var splittable= true
    for(j <- i to arr.length-1) {
      if(arr(i) > arr(j)) splittable = false
    }
    if(splittable) result +=1
    prev = arr(i)
  }
  result
}

maxChunksToSorted(Array[Int](4,3,2,1,0))
maxChunksToSorted(Array[Int](1,0,2,3,4))
maxChunksToSorted(Array[Int](2,0,1))
