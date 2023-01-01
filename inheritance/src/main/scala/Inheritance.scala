object Inheritance extends App {

  class Animal {
    val creatureType: String = "Wild"
    def eat = println("Animal eating")
  }

  class Dog extends Animal {
    override val creatureType: String = "Domestic"
    def eatDog= {
      eat
      println("Croquetas")
    }
    override def eat = println("Como croquetas")
  }

  class Person( name: String, age: Int)
  class Employee(name: String, age: Int, idEmp: Int) extends Person(name, age)

  def dog = new Dog
  dog.eat
  println(dog.creatureType)
}
