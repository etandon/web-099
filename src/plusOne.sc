def plusOne(digits: Array[Int]): Array[Int] = {
  var carry = 1
  for(i <- 0 to digits.length-1){
    if(carry == 1) {
    digits(digits.length-1-i) match{
      case 9 => {
        digits(digits.length-1-i) = 0
        carry =1
      }
      case _ => {
        digits(digits.length-1-i) += 1
        carry =0
      }

    }
    }
  }
  if(carry ==1) (1 :: digits.toList).toArray
  else digits
}


val array = Array(1,2,3)

plusOne(array).toList