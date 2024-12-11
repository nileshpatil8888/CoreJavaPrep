package Collections.List.LinkedList;

import java.util.LinkedList;

import static Collections.List.LinkedList.LinkedListExample.example;

public class LinkedListExample {

    public static void example() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.addFirst("Banana");
        stringLinkedList.add("applke");
        stringLinkedList.addLast("kiwi");

        System.out.println(stringLinkedList);


    }
}

class run{
    public static void main(String[] args) {
        example();
    }
}
