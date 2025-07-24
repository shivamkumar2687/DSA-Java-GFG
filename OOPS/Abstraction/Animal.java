package OOPS.Abstraction;

abstract class Animal {
    
    //Abstract Method(no Body)
    abstract void makeSound();
     
    // Concrete method or Regular method 
    void eat(){
        System.out.println("This Animal Eat Food");
    }
}

class Dog extends Animal{
     
    @Override //Must override the abstract method
    void makeSound(){
        System.out.println("Dog says Bark");
    }
}
class Cat extends Animal{
    @Override
     void makeSound(){
        System.out.println("Cat says Meow");
    }
}

class Main{
    public static void main(String[] args) {
        //Note - you cannot make object of Abstract class - because abstract classes are in complete
        
        Animal a; //Reference to abstract class
        a = new Dog();
        a.makeSound();
        a.eat();

        a = new Cat();
        a.makeSound();
        a.eat();
    }
}