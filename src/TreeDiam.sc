class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def diameterOfBinaryTree(root: TreeNode): Int = {
 if(root == null) 0
 else {
   maxDepth(root.left) + maxDepth(root.right)
 }
}

def maxDepth(root: TreeNode): Int = {
  if(root == null) 0
  else
   math.max(1+ maxDepth(root.left),1+ maxDepth(root.right))
}


val n4 = new TreeNode(4)
val n5 = new TreeNode(5)
val n2 = new TreeNode(2)
n2.left = n4
n2.right = n5
val n3 = new TreeNode(3)
val n1 = new TreeNode(1)
n1.left = n2
n1.right = n3

//maxDepth(n1)

diameterOfBinaryTree(n1)

