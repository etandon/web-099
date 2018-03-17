class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def invertTree(root: TreeNode): TreeNode = {
  if(root == null) null
  else {
    val temp = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(temp)
    root
  }
}

