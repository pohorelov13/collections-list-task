package demo.tasks;

import java.util.Objects;

public class DataStructure {
    private String name;
    private  int occurrence;

    public DataStructure(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataStructure that = (DataStructure) o;
        return occurrence == that.occurrence && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurrence);
    }

    @Override
    public String toString() {
        return "\n{" +
                "name:'" + name + '\'' +
                ", occurrence: " + occurrence +
                "}";
    }
}
