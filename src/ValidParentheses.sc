import scala.collection.mutable

object Solution {
  def isValid(s: String): Boolean = {
    var stack = mutable.Stack[Char]()
    var result = true
    for(i <- 0 to s.length-1)
      s(i) match {
        case '(' | '{' | '[' => stack.push(s(i))
        case elem => {
          var opp = elem match {
            case ')' => '('
            case '}' => '{'
            case ']' => '['
          }
          if(stack.isEmpty) result = false
          else if(stack.pop() != opp) result = false
        }
      }
    if(stack.isEmpty) result
    else false
  }
}

Solution.isValid("{}")

