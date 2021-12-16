

sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]

/** Напишите свои решения в виде функций. */
object RecursiveData {

  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.
  def isEmpty(list: List[Int]): Boolean =  list == Nil()


  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = isEmpty(list)

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.

  def listIntHead(list: List[Int]) : Int = list match {
    case list: Cons[Int] => list.head
    case _ => -1
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = listIntHead(list)

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?

  trait ListWithEnd[A]
  case class ConsWithEnd[A](head: A, tail: ListWithEnd[A]) extends ListWithEnd[A]
  case class End[A](head: A) extends ListWithEnd[A]

  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */

  trait Tree[A]
  case class Node[A](leftBranch: Tree[A], rightBranch: Tree[A]) extends Tree[A]
  case class Leaf[A](head: A) extends Tree[A]



   def main(args: Array[String]): Unit = {

    var list1: List[Int] = Cons(1, Cons(2, Nil()))
    var list2: List[Int] = Nil()

    println()
    println(testListIntEmpty(list2))
    println(testListIntEmpty(list1))
    println()
    println(testListIntHead(list1))
    println(testListIntHead(list2))

    println()
    println()
    println()


    println(
      Node(
           Node(Leaf(1),
                Leaf(2)),
           Node(Leaf(3),
                Node(Leaf(4),
                     Leaf(5)))))
  }
}

