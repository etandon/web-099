class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }

def deleteDuplicates(head: ListNode): ListNode = {
 if (head == null) null
 else {
   var curr = head
   var found = false
   println(s"Current: ${curr.x}")
   while (curr.next != null && head.x == curr.next.x) {
       curr = curr.next
       found = true
     }

   println(curr.x)
   if(found) deleteDuplicates(curr.next)
   else {
     val result = new ListNode(curr.x)
     result.next = deleteDuplicates(curr.next)
     result
   }

 }
}


val n1 = new ListNode(1)
val n2 = new ListNode(2)
val n31 = new ListNode(3)
val n32 = new ListNode(3)
val n41 = new ListNode(4)
val n42 = new ListNode(4)
val n5 = new ListNode(5)

val a = new ListNode(1)
val b = new ListNode(1)
a.next = b


n1.next = n2
n2.next = n31
n31.next = n32
n32.next = n41
n41.next = n42
n42.next = n5


//deleteDuplicates(n1).next.next.x

deleteDuplicates(a)