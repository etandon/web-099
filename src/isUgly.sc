def isUgly(num: Int): Boolean = {
 if(num == 1) true
 else if (num < 1) false
 else {
  if(num%2 == 0) isUgly(num/2)
  else if(num%3 == 0) isUgly(num/3)
  else if(num%5 == 0) isUgly(num/5)
  else false
 }
}

def nthUglyNumber(n: Int): Int = {
 var curr = 1
 var i = 1
 do {
   println(s"i: $i")
   println(s"curr: $curr:${isUgly(i)}")
   if(isUgly(i)) curr +=1
   i +=1
 } while(curr <= n)
 i-1
}

nthUglyNumber(7)