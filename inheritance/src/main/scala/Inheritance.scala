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

  def dog = new Dog
  dog.eatDog
}
