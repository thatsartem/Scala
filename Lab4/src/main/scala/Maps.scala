

/** Напишите вашу реализацию в тестовые функции.
  * 
  * https://docs.scala-lang.org/overviews/collections/maps.html
  */
object Maps {

  case class User(name: String, age: Int)

  /* a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   *   
   */

  def testGroupUsers(users: Seq[User]): Map[String, Int] = {
    def avg(n: Seq[Int]): Int = {
      n.sum/n.length
    }
    users.groupBy(_.name).map{
      x=> (x._1,avg(x._2.map(_.age)))
    }
  }
  /* b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей, содержащихся в Map, содержат подстроку "Adam"?
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testNumberFrodos(map: Map[String, User]): Int = {
    map.count(z=> z._2.name.contains("Adam"))
  }

  /* c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */


  def testUnderaged(map: Map[String, User]): Map[String, User] = {
    val y = map.filter(x => x._2.age>=35)
    y

  }
}
