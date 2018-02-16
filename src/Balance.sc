import scala.collection.immutable.Stack

def isBalanced(s1: String): Boolean = {
  val stack = Stack()

  false

}

def stackCache(list:List[Char], stack: List[Char],balanced: Boolean):Boolean = {
  val lookup = Map(')'->'(','}'->'{',']'->'[')
  list match {
    case a :: rest if (List('(','{','[').contains(a))=> stackCache(rest,List(a) ++ stack,balanced )
    case a :: rest if (List(')','}',']').contains(a) && stack.headOption == lookup.get(a))=> stackCache(rest, stack.tail,balanced )
    case Nil if(stack.isEmpty) => true
    case _ => false
  }
}

val s1= "{}(){}"

if (stackCache(List('{','}','('),List(),true)) println("YES") else println("NO")

