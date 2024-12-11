package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

import static Collections.List.ArrayList.ListExample.list;

public class ListExample {

    public static void list(){
        //adding elements into list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);

        //access element from list by specifying the index
        var access = list.get(1);
        System.out.println(access);

        //Modify
        var modify = list.set(3,9);
        System.out.println(list);

        //remove
        list.remove(5);
        System.out.println(list);
    }
}

class run{
    public static void main(String[] args) {
        list();
    }
}
