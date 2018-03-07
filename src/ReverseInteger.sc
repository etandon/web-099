def reverse(x: Int):Int = {
  val positive = if(x>=0) 1 else -1
  val numString = try {
    Some(math.abs(x).toString.reverse.toInt)
  }
  catch {
    case _ => None
  }
  positive * numString.getOrElse(0)
}

reverse(123)
reverse(-123)
reverse(120)
reverse(1534236469)