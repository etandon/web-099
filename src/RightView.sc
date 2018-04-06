import scala.collection.immutable.Queue

class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def rightSideView(root: TreeNode): List[Int] = {
Nil
}

def prepareQ(root: TreeNode): List[TreeNode] = {
  if(root == null) Nil
  else {
    root ::  prepareQ(root.left) ::: prepareQ(root.right)
  }
}

val n5 = new TreeNode(5)
val n4 = new TreeNode(4)
val n2 = new TreeNode(2)
n2.right = n5
val n3 = new TreeNode(3)
n3.right = n4
val n1 = new TreeNode(1)
n1.left = n2
n1.right = n3

prepareQ(n1).tail.tail.tail.tail.head.value