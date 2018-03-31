class ListNode(var _x: Int = 0) {
    var next: ListNode = null
     var x: Int = _x
   }

def swapPairs(head: ListNode): ListNode = {
  if(head == null || head.next==null) head
  else {
    var e1 = head
    var e2 = head.next
    val temp = e2.next
    e2.next = e1
    e1.next = swapPairs(temp)
    e2
  }

}

val n1 = new ListNode(1)
val n2 = new ListNode(2)
n1.next =n2
val n3 = new ListNode(3)
n2.next =n3
val n4 = new ListNode(4)
n3.next =n4
val n5 = new ListNode(5)
n4.next =n5
val n6 = new ListNode(6)
n5.next =n6
val n7 = new ListNode(7)
n6.next =n7

swapPairs(n1).next.next.next.next.next.next.next
