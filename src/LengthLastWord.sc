def lengthOfLastWord(s: String): Int = {
  if(s.length == 0) return 0
  val sList = s.split(' ')
  if(sList.length== 1) sList(0).length
  else {
    sList.lastOption.getOrElse("").length
  }

}

lengthOfLastWord(" ")
lengthOfLastWord("a")

