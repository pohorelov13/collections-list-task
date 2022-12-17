package demo.phonebook;

import java.util.Objects;

public record Record(String name, String phone) {

    @Override
    public String toString() {
        return "\nRecord{" +
                "name:'" + name + '\'' +
                ", phone:'" + phone + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name) && Objects.equals(phone, record.phone);
    }

}
