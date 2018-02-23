import scala.collection.immutable.TreeSet

val tree = TreeSet(1,2,3,4,5,6,7,0,100,10)


class Tree(val value:Int, val left:Option[Tree]=None,val right: Option[Tree]= None) {
}

def preOrder(t: Tree): Unit = {
  println(s"${t.value} ")
  t.left match {
    case Some(tLeft) => preOrder(tLeft)
    case _ => Unit
  }
  t.right match {
    case Some(tRight) => preOrder(tRight)
    case _ => Unit
  }
}

val t4 = new Tree(4)
val t2 = new Tree(2,None,Some(t4))
val t1 = new Tree(1,None,Some(t2))
val t3 = new Tree(3,Some(t1),None)
val t9 = new Tree(9)
val t15 = new Tree(15,Some(t9))
val t7 = new Tree(7,Some(t3),Some(t15))

preOrder(t7)

def postOrder(t: Tree, l: List[Int]): Unit = {
  if(t.left == None && t.right == None) {
    print(s"${t.value} ")
    print(l.mkString(" "))
  }
  if(t.left != None) postOrder(t.left.get, if(t.right !=None) Nil else List(t.value) ::: l)
  if(t.right != None) postOrder(t.right.get,List(t.value) ::: l)
}

postOrder(t7,Nil)

def inOrder(t: Tree): Unit = {
  if(t.left != None) inOrder(t.left.get)
  println(t.value)
  if(t.right != None) inOrder(t.right.get)
}

inOrder(t7)
inOrder(t9)





