package Java8Features.StreamApi;

import com.sun.jdi.Value;

import java.lang.invoke.VarHandle;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Java8Features.StreamApi.EvenNumbers.*;

public class EvenNumbers {

    public static void evenNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2==0).forEach(System.out::println);
    }

    public static void oddNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2 !=0).forEach(System.out::println);
    }

    public static void convertUppercase(){
        List<String> list = Arrays.asList("Nilesh","mayur","kishori","nil");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void findTheLengthOfLongestString(){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");
        int maxLength = words.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(maxLength);
    }

    public static void countAppearanceOfSpecificWord(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "apple");

        words.stream().filter(name -> name.startsWith("a")).forEach(System.out::println);
    }

    public static void sumOfEvenNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int A = numbers.stream().filter(number -> number %2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(A);
    }

    public static void groupByLength(){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "kiwi", "date");
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length));
        groupedByLength.forEach((Key, Value) -> System.out.println("Length"+ Key + ": " + Value));
    }

    public static void convertToMap(){
        Integer[] numbers = {1, 2, 3, 4, 5};

        Map<Integer,Integer> A = Arrays.stream(numbers).collect(Collectors.toMap(n -> n, n-> n*n));
        System.out.println(A);
    }

    public static void convertListToMap(){
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        var A = people.stream().collect(Collectors.toMap(Person::getName,Person::getAge));
        System.out.println(A);

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class stream {
    public static void main(String[] args) {
        evenNumber();
        oddNumber();
        convertUppercase();
        findTheLengthOfLongestString();
        countAppearanceOfSpecificWord();
        sumOfEvenNumbers();
        groupByLength();
        convertToMap();
        convertListToMap();
    }
}
