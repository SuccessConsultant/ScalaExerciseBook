def itemTwo (s1:String, n: Int, column: Int): Any = {

  if (n == 0)
    println (" ")
  else  print(s1)
  itemTwo(s1, n - 1)
  else print()

}
itemTwo("H" , 4, 4)

