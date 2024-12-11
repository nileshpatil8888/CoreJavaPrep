package OOPS.Inheritance.Hierarchical;

public class Animal {

    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog barking>>>>>>>>>>>>");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("cat is doing meowwwwwwwwwwww >>>>>>>>");
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
