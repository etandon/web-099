class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }

class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def sortedListToBST(head: ListNode): TreeNode = {
  if(head == null) return null
  println(s"sortedListToBST")
  var length = 0
  var curr = head
  while(curr != null) {
    curr = curr.next
    length +=1
  }
  println(length)
  if (length==1) return new TreeNode(head.x)
  val (l1,l2) = if(length%2 == 0) ((length/2)-1,length/2) else ((length-1)/2,(length-1)/2)
  println(s"$l1 $l2")
  var curr1 = head
  for(i <- 1 to l1-1) {
    curr1 = curr1.next
  }
  println(s"${curr1.x}")
  val curr2 = curr1.next
  val result = new TreeNode(curr2._x)
  println(s"Result: ${result.value}")
  curr1.next = null
  result.left = sortedListToBST(head)
  result.right = sortedListToBST(if(curr2==null) null else curr2.next)
  result
}


val n1 = new ListNode(1)
val n2 = new ListNode(2)
n1.next = n2
val n3 = new ListNode(3)
n2.next = n3
val n4 = new ListNode(4)
n3.next = n4
val n5 = new ListNode(5)
n4.next = n5
val n6 = new ListNode(6)
n5.next = n6
val n7 = new ListNode(7)
n6.next = n7

sortedListToBST(n1).left.value