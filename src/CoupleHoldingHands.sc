object Solution {
  def minSwapsCouples(row: Array[Int]): Int = {
    var result = 0
    for(i <- 0 to (row.length/2)-1){
      if(row(2*i)%2 == 0 && row(2*i)+1 == row(2*i+1)) println("No Swap")
      else if(row(2*i)%2 == 1 && row(2*i)-1 == row(2*i+1)) println("No Swap")
      else {
        result +=1
        if(row(2*i)%2 == 0){
          val index = row.indexOf(row(2*i)+1)
          row(index) = row(2*i + 1)
          row(2*i +1) = row(2*i) +1
        }
        else {
          val index = row.indexOf(row(2*i)-1)
          row(index) = row(2*i + 1)
          row(2*i +1) = row(2*i) -1
        }
      }
    }
    result

  }
}