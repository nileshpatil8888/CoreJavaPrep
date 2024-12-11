package OOPS.Inheritance.Single;

public class Animal {

    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("Dog barking>>>>>>>>>>>>");
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
