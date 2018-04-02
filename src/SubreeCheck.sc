class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def isSubtree(s: TreeNode, t: TreeNode): Boolean = {
   if(isEqualTree(s, t)) true
    else (isSubtree(s.left, t) || isSubtree(s.right, t))
}

def isEqualTree(s: TreeNode, t: TreeNode): Boolean = {
  if(s == null && t == null) true
  else if(s==null || t == null) false
  else if(s.value == t.value && isEqualTree(s.left, t.left) && isEqualTree(s.right, t.right)) true
  else false
}