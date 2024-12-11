package OOPS.Polymorphism;

class TravelApp {

    public void fareCalculate(double distance){
        System.out.println("calculating fare for transport");
    }
}

class Car extends TravelApp{

    @Override
    public void fareCalculate(double distance){
        double fare = distance * 5;
        System.out.println("car fare is "+ distance + "km" + fare);
    }
}

class Truck extends TravelApp{

    @Override
    public void fareCalculate(double distance){
        double fare = distance * 5;
        System.out.println("Truck fare is "+ distance + "km" + fare);
    }
}

class Travel {
    public static void main(String[] args) {
        Car car = new Car();
        car.fareCalculate(100);

        Truck truck = new Truck();
        truck.fareCalculate(200);
    }
}
