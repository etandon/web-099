import scala.collection.immutable.ListMap

class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }
object Solution {
  def largestValues(root: TreeNode): List[(Int,Int)] = {
    var result:List[(Int,Int)] = Nil
    if(root == null) Nil
    else {
      var queue:ListMap[TreeNode,Int] = ListMap.empty
      result = result ++ Map(root.value->1)
      if(root.left!=null) queue = queue ++ Map(root.left->2)
      if(root.right!=null) queue = queue ++ Map(root.right->2)
      while (!queue.isEmpty){
        println(s"Queue: $queue")
        var head = queue.head
        result =  result ++ Map(head._1.value->head._2)
        println(s"Result: ${result}")
        if(head._1.left!=null) queue =  queue ++ Map(head._1.left->(head._2+1))
        if(head._1.right!=null) queue = queue ++ Map(head._1.right->(head._2+1))
        queue = queue.tail
      }
      result = result.map(a => (a._2,a._1))
      println(result.groupBy(_._1).map(a => (a._1,a._2.map(b => b._2))))

      result
    }

  }
}


  var n5= new TreeNode(5)
  var n3= new TreeNode(3)
  var n31= new TreeNode(3)
  n31.left = n5
  n31.right = n3

  var n9= new TreeNode(9)
  var n2= new TreeNode(2)
  n2.right = n9

  var n1= new TreeNode(1)
  n1.left = n31
  n1.right = n2

Solution.largestValues(n1)
