class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val int1 = BigInt(stringLL(reverseLL(l1)))
    val int2 = BigInt(stringLL(reverseLL(l2)))
    val sum = (int1 + int2).toString
    reverseLL(stringToLL((sum)))
  }

  def reverseLL(l1: ListNode): ListNode = {
    var ll = l1
    var prev: ListNode = null
    while(ll.next != null) {
      var temp = ll.next
      ll.next = prev
      prev = ll
      ll= temp
    }
    ll.next = prev
    ll
  }

  def stringLL(l1: ListNode): String = {
    var ll = l1
    var result= ""
    while(ll.next != null) {
      result = result + ll.x
      ll=ll.next
    }
    result + ll.x
  }

  def stringToLL(s1: String) : ListNode = {
    var head: ListNode= null
    for(char <- s1) {
      head = addNode(head,Integer.parseInt(char.toString))
    }
    head
  }

  def addNode(ll: ListNode, i: Int): ListNode = {
    var l1 = ll
    if(l1 == null) return new ListNode(i)
    else {
      while(l1 !=null && l1.next != null) {
        l1=l1.next
      }
      l1.next = new ListNode(i)
    }
    ll
  }


}

Solution.addNode(null,1)






var l1 =new ListNode(9)
l1.next=null



var l101 =new ListNode(9)
var l91 =new ListNode(9)
l91.next = l101
var l81 =new ListNode(9)
l81.next = l91
var l71 =new ListNode(9)
l71.next = l81
var l61 =new ListNode(9)
l61.next = l71
var l51 =new ListNode(9)
l51.next = l61
var l41 =new ListNode(9)
l41.next = l51
var l31 =new ListNode(9)
l31.next = l41
var l21=new ListNode(9)
l21.next = l31
var l11 =new ListNode(1)
l11.next=l21

Solution.stringLL(Solution.addTwoNumbers(l1, l11))

//Solution.stringToLL("123")

Long.MaxValue

BigInt("122121")