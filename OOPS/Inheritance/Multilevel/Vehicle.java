package OOPS.Inheritance.Multilevel;

class Vehicle {

    void start(){
        System.out.println("Vehicle is starting");
    }
}

class car extends Vehicle{

    void drive(){
        System.out.println("car is being driven.");
    }

    void petrol(){
        System.out.println("This car requires petrol");
    }

    void NotRequirePetrol(){
        System.out.println("This car not requires petrol");
    }
}

class ElectricCar extends car {
    void charging(){
        System.out.println("This car requires charging");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        car car = new car();
        car.start();
        car.drive();
        car.petrol();

        ElectricCar car1 = new ElectricCar();
        car1.charging();
        car1.start();
        car1.drive();
        car1.NotRequirePetrol();
    }
}
