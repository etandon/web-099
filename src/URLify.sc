def URLify(s1: String) = {
  val s1List = s1.toList.map(a=> a.toString)
  (s1List.map(a => if(a==" ") "%20" else a)).mkString("")
}

URLify("12123 112312 1312  12312")