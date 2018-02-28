import scala.collection.mutable

case class Node(data: Int,next: Option[Node])

val n = Node(1,Some(Node(2,None)))

// 1 -> 3 -> 4 -> 4 -> 5 -> 9 -> 3

val n7 = Node(3,None)
val n6 = Node(9,Some(n7))
val n5 = Node(5,Some(n6))
val n4 = Node(4,Some(n5))
val n3 = Node(4,Some(n4))
val n2 = Node(3,Some(n3))
val n1 = Node(1,Some(n2))

def removeDuplicate(n: Option[Node],l1: List[Int]): Option[Node] = {

  None
}

val linkedList =mutable.LinkedList(1,3,4,4,5,9,3)




