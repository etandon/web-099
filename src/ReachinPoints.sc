def canReach(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = {
 if(x1 == x2 && y1 == y2) true
 else if(x1 > x2 || y1 > y2) false
 else canReach(x1+y1,y1,x2,y2) || canReach(x1,y1+x1,x2,y2)
}

canReach(1, 4, 5, 9)

canReach(1, 2, 2, 1)