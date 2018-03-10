class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }

def rotateRight(head: ListNode, k: Int): ListNode = {
  var length = 0
  var c = head
  while(c != null) {
    c= c.next
    length += 1
  }
  if(k == 0 || head == null) head
  else if(length == k) head
  else {
    val originalHead = head
    var current = head
    var newHead: ListNode = null
    if(k != 1) {
      for (i <- 2 to k) {
        current= current.next
      }
      newHead = current.next
      current.next = null
    }
    else {
      newHead = current.next
      current.next = null
    }
    var current1 = newHead
    while(current1.next != null){
      current1 = current1.next
    }
    current1.next= originalHead
    newHead
  }
}

//val n8= new ListNode(8)
//val n7= new ListNode(7)
//n7.next = n8
//val n6= new ListNode(6)
//n6.next = n7
val n5= new ListNode(5)
n5.next = null
val n4= new ListNode(4)
n4.next = n5
val n3= new ListNode(3)
n3.next = n4
val n2= new ListNode(2)
n2.next = n3
val n1= new ListNode(1)
n1.next = n2

rotateRight(n1,2).next.x

