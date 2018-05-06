object Solution {
  def maskPII(S: String): String = {
    if(S.contains('@')){
     var result = S.toLowerCase
     var name = result.split('@')(0)
     name = s"${name(0)}*****${name.last}"
     println(name)
     s"${name}@${result.split('@')(1)}"
    }
    else{
      var result = S.replaceAll("[()+-]","")
        .replaceAll(" ","")
      if(result.length==10)
        s"***-***-${result.substring(6,10)}"

      else if(result.length==11)
        s"+*-***-***-${result.substring(7,11)}"
      else if(result.length==12)
        s"+**-***-***-${result.substring(8,12)}"
      else
        s"+***-***-***-${result.substring(9,13)}"
    }


  }
}

Solution.maskPII("eshan@gmail.com")
Solution.maskPII("LeetCode@LeetCode.com")
Solution.maskPII("AB@qq.com")
Solution.maskPII("1(234)567-890")
Solution.maskPII("86-(10)12345678")
