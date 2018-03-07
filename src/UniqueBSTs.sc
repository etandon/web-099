class TreeNode(var _value: Int) {
     var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def generateAllPermutations(list: List[Int]): List[List[Int]] = {
  var result = List(List[Int]())
  if(list.length == 1) return List(list)
  for(i <- 0 to list.length-1 ) {
    val filteredList = list.filter(_ !=list(i))
    result = result ::: generateAllPermutations(filteredList).map(list1 => list(i) :: list1)
  }
  result.filter(innerList => innerList.length == list.length)
}

def generateTrees(n: Int): List[TreeNode] = {
  val combinations = generateAllPermutations((1 to n).toList)
  var result = List[TreeNode]()
  for(i <- 0 to combinations.length-1) {
    var node: TreeNode = null
    for(j <- 0 to combinations(i).length-1)
      node = insertInTree(combinations(i)(j),node)
   result = result ::: List(node)
  }
  result
}

def insertInTree(v: Int,t: TreeNode):TreeNode = {
  if(t == null) return new TreeNode(v)
  val head = t
  val currentNode = t
  if (v > currentNode._value) {
      println("Right")
      head.right = insertInTree(v,currentNode.right)
    }
    else {
      head.left = insertInTree(v, currentNode.left)
    }
  head

}


generateAllPermutations(List(1,2,3))

insertInTree(10,insertInTree(1,null)).right._value