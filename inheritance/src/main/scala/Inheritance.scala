case object Inheritance extends App {

  def dog = new Dog
  dog.eat

  class Animal {
    def eat = println("Animal eating")
  }

  class Dog extends Animal
}
