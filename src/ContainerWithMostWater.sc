def maxArea(height: Array[Int]): Int = {
 var maxArea= 0
 for(i <- 0 to height.length-2) {
  for(j <- i to height.length-1){
   val area = Math.min(height(i),height(j))*(j-i)
   if(area > maxArea ) {
    maxArea = area
   }
  }
 }
 maxArea
}

maxArea(Array(1,1))

