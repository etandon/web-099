class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def inOrderTraversal(root: TreeNode):List[Int] = {
  traversal(root: TreeNode,Nil)
}

def traversal(root: TreeNode,list: List[Int]): List[Int] = {
  if(root == null) return list
  var listMutable = list
  listMutable = traversal(root.left,listMutable)
  listMutable = listMutable ::: List(root._value)
  listMutable = traversal(root.right,listMutable)
  listMutable
}

val node3 =new TreeNode(3)
val node2 =new TreeNode(2)
node2.left = node3
val node1 =new TreeNode(1)
node1.right = node2

inOrderTraversal(node1)
