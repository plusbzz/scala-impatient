
////////////////////////////////////////////////////////////////////
def signum(x:Double):Int = if (x > 0) 1 else {if (x < 0) -1 else 0}

println(signum(5.2))
println(signum(-2.7))
println(signum(0))
println()
////////////////////////////////////////////////////////////////////
def countdown(n:Int):Unit = for (i <- 0 to n; j = n-i) println(j)

countdown(5)
println()
////////////////////////////////////////////////////////////////////
for (i <- 1 to 3; j <- i to 3) {print(i);print(" ");println(j)}    // like nested loops!

println()
////////////////////////////////////////////////////////////////////
def raise(x:Double,n:Int):Double = {
  if (x==0) 0 else {    // x = 0
    if (n==0) 1 else {  // n = 0
      if (n > 0) {
        if (n%2 == 0) { // n > 0 and even
          val y = raise(x,n/2);
          y*y
        } else {       // n > 0 and odd
          x*raise(x,n-1)
        }
      } else {        // n < 0
         1.0/raise(x,-n)
      }
    }
  }
}

println(raise(2.5,2))
println(raise(2,3))
println(raise(2,-2))
println(raise(-2,0))
println()
////////////////////////////////////////////////////////////////////
def sum(args:Int*):Int = {
  args.foldLeft (0) {(result:Int,x:Int) => result+x}
}

println(sum(1,2,3,4))
println()
////////////////////////////////////////////////////////////////////
