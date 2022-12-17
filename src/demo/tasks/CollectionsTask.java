package demo.tasks;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {

    public void countOccurrence(List<String> list, String s) {
        int counter = 0;
        for (String value : list) {
            if (value.equals(s)) {
                counter++;
            }
        }

        System.out.println(counter);
    }

    public List<Integer> toList(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        for (int elem :
                arr) {
            list1.add(elem);

        }
        return list1;
    }

    public List<Integer> findUnique(List<Integer> list) {
        List<Integer> listUnique = new ArrayList<>();
        for (int elem :
                list) {
            if (!listUnique.contains(elem)) {
                listUnique.add(elem);
            }
        }
        return listUnique;
    }

    public void calcOccurrence(List<String> list) {
        List<String> listUnique = new ArrayList<>();

        for (String str : list) {
            int counter = 0;
            for (String s : list) {
                if (s.equals(str)) {
                    counter++;
                }
            }
            if (!listUnique.contains(str)) {
                listUnique.add(str);
                System.out.println(str + ": "+ counter);
            }
        }
    }

    public List<DataStructure> findOccurrence(List<String> strings) {
        List<DataStructure> temp = new ArrayList<>();
        List<DataStructure> list = new ArrayList<>();
        for (String str : strings) {
            int occurrence = 0;
            for (String string : strings) {
                if (str.equals(string)) {
                    occurrence++;
                }
            }
            temp.add(new DataStructure(str, occurrence));
        }
        for (DataStructure elem : temp) {
            if (!list.contains(elem)) {
                list.add(elem);
            }
        }
        return list;

    }
}

