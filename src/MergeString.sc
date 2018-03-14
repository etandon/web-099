def mergeStrings(a: String, b: String): String = {
    var result =""
    for(i <- 0 to (Math.min(a.length,b.length))-1) {
      result = result + a(i) + b(i)
    }
    val long = if(a.length < b.length) b else a
    //println(s"Long: $long")
    val short =if(a.length >= b.length) b else a
    //println(s"Short $short")
    //println(s"Sub String: ${long.substring(short.length)}")
    result + long.substring(short.length)
}


mergeStrings("123456789", "qwertyuiozxcvb")