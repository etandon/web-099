class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }

def splitListToParts(root: ListNode, k: Int): Array[ListNode] = {
  val splitNumber = splitNumbers(root, k)
  println(s"Split: ${splitNumber.toList}")
  val result = Array.fill[ListNode](k)(null)
  result(0) = root
  for(i <- 0 to splitNumber.length-1) {
    var curr = result(i)
    if(curr!=null) {
      for (j <- 1 to splitNumber(i) - 1) {
        curr = curr.next
      }
    }
    if(curr!=null && i < splitNumber.length-1) {
      result(i + 1) = curr.next
    }
    if(curr != null) curr.next = null

  }
  result
}

def splitNumbers(root: ListNode, k: Int): Array[Int] = {
  var head = root
  var length = 0
  while(head != null) {
    head = head.next
    length += 1
  }
  var divisor = length/k
  var remainder = length%k
  var result = Array.fill[Int](k)(0)
  for(i <- 0 to k-1) {
    var rem = if(remainder > 0) 1 else 0
    result(i) = divisor + rem
    remainder -=1
  }
  result
}

val n1 = new ListNode(1)


val (a::b::c::Nil) = splitListToParts(n1,3).toList

