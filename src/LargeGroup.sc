object Solution {
  def largeGroupPositions(S: String): List[List[Int]] = {
   if(S.length<3) List.empty
   else {
     println("else")
     var result = List[List[Int]]()
     var start = 0
     var end = 0
     var count =0
     var prev:Option[Char] = None
     for(i <- 0 to S.length-1){
       //println(s"$i: ${S(i)}")
       if(prev == None){
         //println("Case 0")
         prev = Some(S(i))
         count +=1
         start = i
         end = i
       }
       else if(S(i) == prev.get){
         //println("Case 1")
         count +=1
         end +=1
         if(i == S.length-1){
           //println(s"Last Equal:$count")
           if(count>=3)
             result = result ++ List(List(start,end))
         }

       }
       else if(count>=3){
         //println("Case 2")
         count = 1
         result = result ++ List(List(start,end))
         start = i
         end = i
         prev= Some(S(i))
       }
       else {
         //println("Case 3")
         count = 1
         prev = Some(S(i))
         start = i
         end = i
       }

     }
     result
   }
  }
}

Solution.largeGroupPositions("abbxxxxzzy")
Solution.largeGroupPositions("abc")
Solution.largeGroupPositions("abcdddeeeeaabbbcd")
Solution.largeGroupPositions("aaa")
Solution.largeGroupPositions("babaaaabbb")
