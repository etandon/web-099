def removeNthFromEnd(head: ListNode,n: Int): ListNode = {
    var newHead = head
    var pointer1 = newHead
    var pointer2 = newHead
    var entered = false
    for{
      i <- 1 to (n+1)
      if(pointer2 != null)
    } {
      pointer2= pointer2.next
    }
    //println(s"Pointer2: ${pointer2.x}")
    while(pointer2!=null && pointer1!=null){
      println("Entered")
      pointer2 = pointer2.next
      pointer1 = pointer1.next
      entered=true
    }
    println(s"Pointer1: ${pointer1.x}")
    println(s"Entered: $entered")
    if(!entered && n!=1) {
      println(s"Entered: $entered")
      newHead = pointer1.next
    }
    else if(pointer1.next !=null) pointer1.next= pointer1.next.next
    else newHead = null
    newHead
  }

  class ListNode(var _x: Int = 0) {
       var next: ListNode = null
       var x: Int = _x
     }

val n1 = new ListNode(1)
val n2 = new ListNode(2)
n2.next = n1
val n3 = new ListNode(3)
n3.next = n2
val n4 = new ListNode(4)
n4.next = n3
val n5 = new ListNode(5)
n5.next = n4
val n6 = new ListNode(6)
n6.next = n5
val n7 = new ListNode(7)
n7.next = n6
val n8 = new ListNode(8)
n8.next = n7

//removeNthFromEnd(n8,2).next.next.next.next.next.next.x

//removeNthFromEnd(n1,1)

//removeNthFromEnd(n2,2).x

removeNthFromEnd(n2,1).x



