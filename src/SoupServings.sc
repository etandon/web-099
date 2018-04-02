def soupServings(N: Int): Double = {
  prob(N, N, 0)
}

def prob(a: Int, b: Int, level: Int):Double = {
  val intProb = math.pow(0.25,level)
  if(a<=0 && b<=0) intProb*0.5
  else if(a<=0) intProb*1
  else if(b<=0) 0
  else prob(a-100,b,level+1)+prob(a-75,b-25,level+1)+prob(a-50,b-50,level+1)+prob(a-25,b-75,level+1)
}

prob(50, 50, 0)

soupServings(800)