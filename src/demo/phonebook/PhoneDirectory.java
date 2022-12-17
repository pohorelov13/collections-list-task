package demo.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    private final List<Record> list = new ArrayList<>();

    public List<Record> getList() {
        return list;
    }

    public void add(Record record) {
        if (!list.contains(record)) {
            list.add(record);
        }
    }


    public Record find(String str) {
        for (Record record :
                list) {
            if (record.name().equals(str)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String str) {
        List<Record> temp = new ArrayList<>();
        for (Record record : list) {
            if (record.name().equals(str)) {
                temp.add(record);
            }
        }
        return temp;
    }
}
