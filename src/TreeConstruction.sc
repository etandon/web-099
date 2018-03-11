class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
   }

def buildTree(preorder: Array[Int], inorder: Array[Int]): TreeNode = {
  if(preorder.length == 0) null
  else {
    val root = new TreeNode(preorder(0))
    println(s"Root: ${root._value}")
    val (inOrderSet1,inOrderSet2) =inorder.splitAt(inorder.indexOf(root._value))
    val inOrderList1 = inOrderSet1.toList
    val inOrderList2 = inOrderSet2.toList.drop(1)
    println(s"inOrder 1: ${inOrderList1}")
    println(s"inOrder 2: ${inOrderList2}")
    val (preOrderSet1,preOrderSet2) = preorder.drop(1).splitAt(inOrderList1.length)
    val preOrderList1 = preOrderSet1.toList
    val preOrderList2 = preOrderSet2.toList
    println(s"preOrder 1: ${preOrderList1}")
    println(s"preOrder 2: ${preOrderList2}")
    root.left = buildTree(preOrderList1.toArray, inOrderList1.toArray)
    root.right= buildTree(preOrderList2.toArray, inOrderList2.toArray)
    root
  }

}

val preOrder = Array(3,9,20,15,7)
val inOrder = Array(9,3,15,20,7)

buildTree(preOrder, inOrder).right.right._value