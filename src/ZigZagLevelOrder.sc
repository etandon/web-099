

class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def zigzagLevelOrder(root: TreeNode): List[List[Int]] = {
  if(root == null) return List[List[Int]]()
  travel(List[List[Int]](),0,List(root))
}

def travel(result: List[List[Int]],level: Int,list: List[TreeNode]):List[List[Int]] = {
  if(list.isEmpty) return result
  println(s"Level: $level")
  var resultList = List[Int]()
  var nextLevelList = List[TreeNode]()
  for(i <- 0 to list.length-1){
    resultList = resultList ::: List(list(i).value)
    println(s"Result List: $resultList")
    if(list(i).left != null) nextLevelList = nextLevelList ::: List(list(i).left)
    if(list(i).right != null) nextLevelList = nextLevelList ::: List(list(i).right)
  }
  if(level % 2 != 0) resultList = resultList.reverse
  travel(result ::: List(resultList),level+1,nextLevelList)
}


val n15 = new TreeNode(15)
val n7 = new TreeNode(7)
val n20 = new TreeNode(20)
n20.left = n15
n20.right = n7
val n9 = new TreeNode(9)
val n3 = new TreeNode(3)
n3.left = n9
n3.right = n20

zigzagLevelOrder(n3)





