import scala.collection.mutable
import scala.collection.immutable.HashSet


// Immutable set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"), jetSet.contains("Lear"), jetSet)

// Mutable set
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

// HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")