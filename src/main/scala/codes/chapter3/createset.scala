var jetSet = Set("Boeing","Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

/*
If you want a mutable set, you'll need to use an import, as shown in Listing 3.6:
import scala.collection.mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)
*/

// import scala.collection.immutable.HashSet
// val hashSet = HashSet("Tomatoes", "Chilies")
// println(hashSet + "Coriander")