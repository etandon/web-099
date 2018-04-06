def triangle(a: Int, b: Int, c: Int): Int = {
  if(a == b && b == c) 1
  else if(a<1 || b<1 || c<1) 0
  else if((a+b >c) && (b+c > a) && (c+a > b)) 2
  else 0
}