object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }
    println(rotation(n,k,a) mkString " ")
  }

  def rotation(length: Int,rotation: Int,set: Array[Int]): List[Int] = {
    val list = set.toList
    val actualRotation = rotation%length
    val (list1,list2) =list.splitAt(actualRotation)
    list2 ::: list1
  }
}

Solution.rotation(5,2,Array(1,2,3,4,5))


List("q","w","e","r","t","y").splitAt(2)

