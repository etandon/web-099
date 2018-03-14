class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def minDepth(root: TreeNode): Int = {
  if(root != null) println(s"Root: ${root.value}")
  if(root == null) 0
  else if(root.left == null && root.right==null) 1
  else if(root.left == null) 1 + minDepth(root.right)
  else if(root.right == null) 1 + minDepth(root.left)
  else {
    //println(s"Left: ${minDepth(root.left)}")
    //println(s"Right: ${minDepth(root.right)}")
    1 + Math.min(minDepth(root.left),minDepth(root.right))
  }
}


val n1 = new TreeNode(1)
val n3 = new TreeNode(3)
val n2 = new TreeNode(2)
n2.left = n1
n2.right = n3
val n4 = new TreeNode(4)
val n6 = new TreeNode(6)
val n8 = new TreeNode(8)
val n7 = new TreeNode(7)
n7.left = n6
n7.right = n8
val n5 = new TreeNode(5)
n5.right = n7
n4.left = n2
n4.right = n5

minDepth(n4)