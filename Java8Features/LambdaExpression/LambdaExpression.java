package Java8Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

    public void lambda(){
        List<String> names = Arrays.asList("Nilesh", "Mayur", "tanmay");

        names.stream().filter(name -> name.startsWith("M"))
                .forEach(System.out::println);
    }
}

class lambda{
    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();
        lambdaExpression.lambda();
    }
}
