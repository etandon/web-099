class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

object Solution {
  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
    if(t1 == null) t2
    else if(t2==null) t1
    else {
      var result: TreeNode = new TreeNode(t1.value + t2.value)
      result.left = mergeTrees(t1.left, t2.left)
      result.right = mergeTrees(t1.right, t2.right)
      result
    }
  }
}

var t5= new TreeNode(5)
var t1= new TreeNode(1)
var t3= new TreeNode(3)
t3.left = t5
var t2= new TreeNode(2)
t1.left = t3
t1.right = t2

var T4= new TreeNode(4)
var T7= new TreeNode(7)
var T1= new TreeNode(1)
var T3= new TreeNode(3)
T1.right = T4
T3.right = T7
var T2= new TreeNode(2)
T2.left = T1
T2.right = T3

Solution.mergeTrees(t1,T2).right.right.value


