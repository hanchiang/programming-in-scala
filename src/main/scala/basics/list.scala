// Each element of a list is immutable
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
// ::: concatenate 2 lists
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

// ::(cons) prepend an element to a list
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

