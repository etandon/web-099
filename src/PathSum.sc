class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def hasPathSum(root: TreeNode, sum: Int): Boolean = {
  if(root == null) false
  else if(sum == root.value && root.left == null && root.right == null) true
  else {
    hasPathSum(root.left, sum-root.value) || hasPathSum(root.right, sum-root.value)
  }
}


val n7 = new TreeNode(7)
val n2 = new TreeNode(2)
val n11 = new TreeNode(11)
n11.left = n7
n11.right = n2
val n4 = new TreeNode(4)
n4.left = n11
val n1 = new TreeNode(1)
val n41 = new TreeNode(4)
n41.right = n1
val n13 = new TreeNode(13)
val n8 = new TreeNode(8)
n8.left = n13
n8.right = n4
val n5 = new TreeNode(5)
n5.left = n4
n5.right = n8

hasPathSum(n5, 22)