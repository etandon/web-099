class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def rob(root: TreeNode): Int = {
  if(root == null) 0
  else {
    math.max(sumRoot(root,0),sumRoot(root.left,0)+sumRoot(root.right,0))
  }

}

def sumRoot(root: TreeNode,sum: Int): Int = {
  if(root == null) 0
  else {
    val leftSum = if(root.left != null) sumRoot(root.left.left,0)+sumRoot(root.left.right,0) else 0
    val rightsum = if(root.right != null) sumRoot(root.right.left,0)+sumRoot(root.right.right,0) else 0
    //sum + leftSum + rightsum + root.value
    sum + math.max(sumRoot(root: TreeNode,0),1)
    0
  }
}


//val n3 = new TreeNode(3)
//val n4 = new TreeNode(4)
//val n5 = new TreeNode(5)
//n3.left = n4
//n3.right = n5
//val n1 = new TreeNode(1)
//val n31 = new TreeNode(3)
//n4.left = n1
//n4.right = n31
//val n11 = new TreeNode(1)
//n5.right = n11
//
//sumRoot(n3,0)
//rob(n3)


val n4 = new TreeNode(4)
val n1 = new TreeNode(1)
n4.left =n1
val n2 = new TreeNode(2)
n1.left = n2
val n3 = new TreeNode(3)
n2.left = n3
rob(n4)

