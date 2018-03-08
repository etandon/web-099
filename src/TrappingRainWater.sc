def trap(height: Array[Int]): Int = {
  var water = 0
  var starting = 0
  if(height.length<3) return 0
  while(height(starting) == 0) starting += 1
  var ending = starting+1
  while(ending < height.length){
    if(height(starting) <= height(ending)){
      water = water + calWater(starting,ending,height)
      starting = ending
      ending = ending + 1
    }
    else {
      ending += 1
    }

  }
  water
}

def calWater(i: Int,j:Int, height: Array[Int]):Int = {
  val min = Math.min(height(i),height(j))
  val area = min*(j-i-1)
  var tower = 0
  for(k <- i+1 to j-1){
    tower = tower + (if(height(k)>min) min else height(k))
  }
  area-tower

}


val arr = Array(4,2,3)

trap(arr)

trap(Array(3,2,4))

//calWater(3,5,arr)