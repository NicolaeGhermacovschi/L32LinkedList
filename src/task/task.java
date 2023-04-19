package task;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class task {

    LinkedHashMap<Person, Integer> linkedHashMap = new LinkedHashMap<>();

    public void add() {
        linkedHashMap.put(new Person("Nicolae", 22), 2000);
        linkedHashMap.put(new Person("Vlad", 24), 6000);
        linkedHashMap.put(new Person("Anton", 52), 4000);
        linkedHashMap.put(new Person("Grigore", 42), 3000);
    }

    public void task2() {


        System.out.println(linkedHashMap);

        LinkedHashSet<Integer> salary = new LinkedHashSet<>();

        for (Integer value : linkedHashMap.values()) {
            salary.add(value);
        }

        System.out.println(" salary : " + salary);

    }

    public void task3() {

        LinkedList<Person> people = new LinkedList<>();

        for (Person person : linkedHashMap.keySet()) {
            people.add(person);
        }

        System.out.println("people " + people);
    }
}
