println("hello")
val a = Array(1, 2, 3)
a.foreach(i => println(i))
a.foreach(println)
for (arg <- a) println(arg)

val list = List(4, 5, 6)