class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def isBalanced(root: TreeNode): Boolean = {
 if (root == null) true
 else {
   val diff = math.abs(depth(root.left, 0)-depth(root.right, 0))
   (diff == 1 || diff ==0) && isBalanced(root.left) && isBalanced(root.right)
 }

}

def depth(root: TreeNode, length: Int):Int = {
 if(root == null) length
  else {
   math.max(depth(root.left,length+1),depth(root.right,length+1))
 }
}

//val t3 = new TreeNode(3)
//val t9 = new TreeNode(9)
//val t20 = new TreeNode(20)
//t3.left = t9
//t3.right = t20
//val t15 = new TreeNode(15)
//val t7 = new TreeNode(7)
//t20.left = t15
//t20.right = t7
//
//isBalanced(t3)

val t1 = new TreeNode(1)
val t21 = new TreeNode(2)
val t22 = new TreeNode(2)
t1.left = t21
t1.right = t22
val t31 = new TreeNode(3)
val t32 = new TreeNode(3)
t21.left = t31
t22.right = t32
val t41 = new TreeNode(4)
val t42 = new TreeNode(4)
t31.left = t41
t32.right = t42

isBalanced(t1)
