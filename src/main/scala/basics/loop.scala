
def whileLoop(): Unit = {
  println("--- while loop ---")
  var i = 0
  while (i < args.length) {
    if (i != 0) {
      print(" ")
    }
    print(args(i))
    i += 1
  }
  println()
}

def foreach(): Unit = {
  println("--- for each ---")
  args.foreach(arg => println(arg))
  // Same as above, but more succint
  //  args.foreach(println)
}

def forLoop():Unit = {
  println("--- for ---")
  for (arg <- args) {
    println(arg)
  }
}


whileLoop()
foreach()
forLoop()
