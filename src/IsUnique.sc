def isUnique(input: String) = {
  !(input.toList.groupBy(a => a).mapValues(_.size).exists(_._2 > 1))
}

isUnique("qweqwqewqw")
isUnique("qwerty")
isUnique("qwertyxcvbn")