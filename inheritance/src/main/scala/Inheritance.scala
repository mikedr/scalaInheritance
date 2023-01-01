object Inheritance extends App {

  class Animal {
    def eat = println("Animal eating")
  }

  class Dog extends Animal {
    def eatDog= {
      eat
      println("Croquetas")
    }
  }

  class Person( name: String, age: Int)
  class Employee(name: String, age: Int, idEmp: Int) extends Person(name, age)

  def dog = new Dog
  dog.eatDog
}
