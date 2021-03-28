// Each element of an array is mutable
// Declare array
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2) {
  print(greetStrings(i))
}

// Create and initalise array
val nums = Array("zero", "one", "two")
for (num <- nums) {
  print(num)
}