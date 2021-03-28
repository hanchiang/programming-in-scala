def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

// If a function body has just 1 line, braces can be omitted
def max2(x: Int, y: Int): Int = if (x > y) x else y

println("max(2, 5): " + max(2, 5));
println("max2(2, 5): " + max2(2, 5));