class GraphNode(var _x: Int=0)  {
  var child: List[GraphNode] = Nil
  var value: Int = _x
}

object Solution {
  def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
    var graphList = graph.map(a => a.toList).toList
    var l1 = 0 to graphList.length-1
    var map = (l1 zip graphList).toMap
    println(s"Graph List: ${map}")
    var path = findPath(0,l1.last,map,Nil,Nil)
    path
  }

  def findPath(s: Int, d: Int, graph: Map[Int,List[Int]],currentList: List[List[Int]],indexList: List[Int]):List[List[Int]] = {
    graph.get(s) match {
      case None => currentList
      case Some(list) if(list.contains(d))=> ((indexList ++ List(s,d)) :: currentList) ++ (list.map(a => findPath(a, d, graph, currentList, indexList ++ List(s))).flatten)
      case Some(list) => {
        var result = list.map(a => findPath(a, d, graph, currentList, indexList ++ List(s)))
        result.flatten
      }
    }
  }




}

var graph = Array(
                  Array(4,1,3),
                  Array(3,2,4),
                  Array(3),
                  Array(4),
                  Array[Int]()
                  )

Solution.allPathsSourceTarget(graph)

