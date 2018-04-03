def subdomainVisits(cpdomains: Array[String]): List[String] = {
  var result = Map[String,Int]()
  for(i <- 0 to cpdomains.length-1) {
    var (num,domain) =cpdomains(i).splitAt(cpdomains(i).indexOf(' '))
    println(s"Num:$num")
    println(s"Domain:${domain.trim}")
    domain = domain.trim
    while(domain.contains('.')){
      println(s"domain: $domain")
      if(result.contains(domain)) result = (result ++ Map(domain -> (result.get(domain).get+num.toInt)))
      else result = (result ++ Map(domain -> num.toInt))
      domain = domain.splitAt(domain.indexOf('.')+1)._2
    }
    if(result.contains(domain)) result = (result ++ Map(domain -> (result.get(domain).get+num.toInt)))
    else result = (result ++ Map(domain -> num.toInt))

  }
  println(result)
  result.toList.map(x => s"${x._2} ${x._1}")
}

subdomainVisits(Array[String]("900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"))