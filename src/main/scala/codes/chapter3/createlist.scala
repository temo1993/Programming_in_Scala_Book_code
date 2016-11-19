val oneTwoThree = List(1,2,3)

val oneTwo = List(1,2)
val threeFour = List(3,4)

// List in Scala is immutable, like Array in Java
// In Scala List concatenation is done by :::
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list")
// Output is:
// List(1, 2) and List(3, 4) were not mutated.
// Thus, List(1, 2, 3, 4) is a new list.

/*Perhaps the most common operator you'll use with lists is `::', which is pronounced "cons."Cons
prepends a new element to the beginning of an existing list and returns the resulting list. For example,
if you run this script: */
val twoThree = List(2,3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)
/* Output is: List(1, 2, 3) */

/* Given that a shorthand way to specify an empty list is Nil, one way to initialize new lists is to string
together elements with the cons operator, with Nil as the last element.[4] For example, the following
script will produce the same output as the previous one, "List(1, 2, 3)":
*/
val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)