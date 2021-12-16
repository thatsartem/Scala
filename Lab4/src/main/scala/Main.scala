object Main extends App{
    var seq=Seq(9,8,7,6,5,6,7,8,9)
    var seq3=Seq(1,3)
    var seq4=Seq(2,4)
  var seq2=Seq(9,8,7,6,5,4,3)
  def func(num:Int):Boolean=num>3
  def func2(x:Int):Seq[Double]=Seq(x,x+x)
  println(Strings.testComputation(1,3))
  println(Strings.testInterpolations("august", 12))
  println(Strings.testUppercase("\nhi mom, im studying at mtuci"))
  println(Sequence.testZip(Seq(1,2),Seq(2,3)))
  println(Maps.testUnderaged(Map("2"->Maps.User("anton",45),"3"->Maps.User("emily",25))))
  println(Maps.testNumberFrodos(Map("2"->Maps.User("asdasdAdam",45),"3"->Maps.User("Adam",25),"4"->Maps.User("emily",25))))
  println(Maps.testGroupUsers(Seq(Maps.User("adam",20),Maps.User("adam",40),Maps.User("nana",20)))) 
  println(Adts.testDouble(Some(6)))
  println(Adts.testIsEven(5))
  println(Adts.testSafeDivide(2,4))
  println(Adts.testSafeDivide(2,0))
  println(Adts.testGoodOldJava((x => (x.toInt*x.toInt)),"8"))
  println(Adts.testGoodOldJava((x => (x.toInt*x.toInt)),"abc"))
  print("  ")
  println(Sequence.testLastElement(seq))
  print("  ")
  println(Sequence.testZip(seq3,seq4))
  print("  ")
  println(Sequence.testForAll(seq)(func))
  print("  ")
  println(Sequence.testPalindrom(seq))
  print("  ")
  println(Sequence.testFlatMap(seq)(func2))

    
    


}
