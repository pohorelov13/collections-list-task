package demo;

import demo.tasks.CollectionsTask;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integerList.add((int)(Math.random() * i));
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Hillel");
        stringList.add("Hello");
        stringList.add("Bird");
        stringList.add("Football");
        stringList.add("Soccer");
        stringList.add("Soccer");
        stringList.add("Bird");
        stringList.add("Hello");
        stringList.add("Night");
        stringList.add("Bird");
        stringList.add("Word");
        stringList.add("Sword");
        stringList.add("Word");
        stringList.add("Word");
        stringList.add("Car");
        stringList.add("Hillel");




        int[] arr = {5, 15, 20, 35, 45};

        CollectionsTask task = new CollectionsTask();

        task.countOccurrence(stringList, "Hillel");

        System.out.println(task.toList(arr));

        task.calcOccurrence(stringList);

        System.out.println(integerList);
        System.out.println(task.findUnique(integerList));

        System.out.println(task.findOccurrence(stringList));
    }
}
