package exercise1

/* 
 * 
 a) Создать класс Animal, который имеет следующие поля:
 *      - name: String (название)
 *      - species: String (вид)
 *      - food: String
 * 
 *    Синтаксис: class MyClass(val publicField: Int, privateField: String) {
 *              // остальные поля и методы
 *            }
 * 
 * b) Создайте объект-компаньон для класса Animal и добавьте следующие сущности как поля:
 *      - cat, mammal, meat
 *      - parrot, bird, vegetables
 *      - goldfish, fish, plants
 * 
 *    Синтаксис: object MyClass {
 *              // статические поля и методы
 *            }
 * 
 * 
 * c) Добавьте следующие метод в Animals:
 *      def eats(food: String): Boolean
 *    
 *     который проверяет ест ли животное определенную пищу
 * 
 * d) Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
 *    Вам все еще нужно поле `species`?
 * 
 * e) Добавьте следующие функции в объект-компаньон Animal:
 *      def knownAnimal(name: String): Boolean  // true если это имя одного из трех животных из (b)
 *      def apply(name: String): Option[Animal] // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None), см. ниже
 * 
 * f) Создайте трейт Food со следующими классами-образцами:
 *      - Meat
 *      - Vegetables
 *      - Plants
 *   и добавьте это в определение Animal. Так же добавьте объект-компаньон с методом apply():
 *      def apply(food: String): Option[Food]
 */

sealed trait Option[A] {
 
  def isEmpty: Boolean
}
case class Some[A](a: A) extends Option[A] {
  val isEmpty = false
}
case class None[A]()     extends Option[A] {
  val isEmpty = true
}

trait Food

class Meat extends Food
class Vegetables extends Food
class Plants extends Food 

trait Animal {
  val name: String
  val food: Food
  def eats(food: Food): Boolean = {
    food.equals(this.food)
  }
}

class Mammal(val name: String, val food: Food) extends Animal
class Fish(val name: String, val food: Food)   extends Animal
class Bird(val name: String, val food: Food)   extends Animal


object Animal{
  val tom = Mammal("cat", new Meat)
  val kesha = Bird("parrot", new Vegetables)
  val nemo = Fish("goldfish", new Plants)
  def knownAnimal(name: String): Boolean = name match{
    case tom.name => true
    case kesha.name => true
    case nemo.name => true
    case _ => false
  }
  def apply(name: String): Option[Animal] = name match{
    case tom.name => Some(tom)
    case kesha.name => Some(kesha)
    case nemo.name => Some(nemo)
    case _ => None()
  }

}

object Food {
  def apply(food: String): Option[Food] = food match {
    case "Meat" => Some(new Meat)
    case "Plants" => Some(new Plants)
    case "Vegetables" => Some(new Vegetables)
    case _ => None()
  }
}