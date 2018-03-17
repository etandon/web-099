class TreeNode(var _value: Int) {
  var value: Int = _value
     var left: TreeNode = null
     var right: TreeNode = null
   }

def deleteNode(root: TreeNode, key: Int): TreeNode = {
  var found = false
  var curr = root
  var prev:TreeNode = null
  var prevLeft:Option[Boolean] = None
  while(curr !=null && !found) {
    println(s"Current: ${curr.value}")
    if(key > curr.value) {
      prev = curr
      prevLeft = Some(false)
      curr = curr.right
    }
    else if(key < curr.value) {
      prev = curr
      prevLeft = Some(true)
      curr = curr.left
    }
    else {
      println("Found")
      found = true
    }
  }
  if(found) {
    println("Found")
    if(prevLeft == Some(true)) {
      println("prevLeft")
      prev.left = shiftRoot(curr)
      root
    }
    else if(prevLeft == Some(false)) {
      println("prevRight")
      prev.right = shiftRoot(curr)
      root
    }
    else {
      shiftRoot(curr)
    }
  }
  else {
    println("Not Found")
    root
  }

}

def shiftRoot(root: TreeNode): TreeNode ={
  if(root == null) null
  else if(root.left !=null) {
    root.value = root.left.value
    root.left = shiftRoot(root.left)
    root
  }
  else if(root.right !=null){
    root.value = root.right.value
    root.right = shiftRoot(root.right)
    root
  }
  else null
}

val n1 = new TreeNode(1)
val n7 = new TreeNode(7)
val n10 = new TreeNode(10)
val n2 = new TreeNode(2)
n2.left = n1
val n9 = new TreeNode(9)
n9.left = n7
n9.right = n10
val n5= new TreeNode(5)
n5.left = n2
n5.right = n9

//shiftRoot(n5).right.value


deleteNode(n5, 9).right.value
