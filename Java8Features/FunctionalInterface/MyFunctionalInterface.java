package Java8Features.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

    void execute();
}

class functional {
    public static void main(String[] args) {
        //Lambda expression
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("task executing");
        myFunctionalInterface.execute();
    }
}
