import scala.collection.mutable.HashMap

object Solution {
  def isIsomorphic(s: String, t: String): Boolean = {
   if(s.length != t.length) false
   else {
     var map = new HashMap[Char,Char]()
     var result = true
     for(i <- 0 to s.length-1){
       if(map.get(s(i)).isEmpty) {
         if(map.values.toSet.contains(t(i)))
           return false
         map.put(s(i), t(i))
       }
       else
         if(map.get(s(i)).get != t(i))
         return false
     }
     true
   }

  }
}

Solution.isIsomorphic("egg","add")
Solution.isIsomorphic("foo","bar")
Solution.isIsomorphic("paper","title")
Solution.isIsomorphic("ab","aa")