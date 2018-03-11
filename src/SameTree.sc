class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
  if(p == null && q == null) true
  else if((p==null && q !=null) || (q==null && p!=null)) false
  else if((p._value == q._value) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) true
  else false
}

def preOrder(t: TreeNode,l: List[Int]): List[Int] = {
  var result = l
  if(t == null) l
  else {
    result = l ::: List(t._value)
    result = preOrder(t.left,result)
    result = preOrder(t.right,result)
    result
  }
}

val n4 = new TreeNode(4)
val n5 = new TreeNode(5)
n5.left=n4
val n7 = new TreeNode(7)
val n9 = new TreeNode(9)
val n8 = new TreeNode(8)
n8.left = n7
n8.right = n9
val n6 = new TreeNode(6)
n6.left = n5
n6.right = n8

preOrder(n6,Nil)

