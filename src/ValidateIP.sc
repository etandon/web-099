object Solution {
  def validIPAddress(IP: String): String = {
    if(IP.contains(".")){
      val split = IP.split('.')
      if(split.length != 4) "Neither"
      else {
        println(s"${split.map(a => bit255(a))}")
        if((split.map(a => bit255(a)).filter(_ == false)).length > 0) "Neither"
        else "IPv4"
      }
    }
    else if(IP.contains(":")) {
      val split = IP.split(':')
      if(split.length != 8) "Neither"
      else if(IP.startsWith(":") || IP.endsWith(":")) "Neither"
      else {
        println(s"${split.map(a => hexa(a)).toList}")
        if((split.map(a => hexa(a)).filter(_ == false)).length > 0) "Neither"
        else "IPv6"
      }
    }
    else "Neither"

  }
  def bit255(S: String): Boolean = {
    try {
      if(S.startsWith("0") && S.length >1) false
      else if (S.toInt <= 255 && S.toInt >=0) true
      else false
    }
    catch {
      case e:Exception => false }
  }
  def hexa(S:String): Boolean = {
    println(s"$S: ${S.matches("[0-9a-fA-F]{4}")}")
    S.matches("[0-9a-fA-F]{4}") || S.matches("[0]")
  }
}

//Solution.validIPAddress("172.16.254.1")

Solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:")