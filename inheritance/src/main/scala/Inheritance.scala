object Inheritance extends App {

  class Animal {
    val creatureType: String = "Wild"
    def eat = println("Animal eating")
  }

  class Dog(override val creatureType: String) extends Animal {
    def eatDog= {
      eat
      println("Croquetas")
    }
    override def eat = println("Como croquetas")
  }

  class Person( name: String, age: Int)
  class Employee(name: String, age: Int, idEmp: Int) extends Person(name, age)

  def dog = new Dog("Casero")
  dog.eat
  println(dog.creatureType)
}
