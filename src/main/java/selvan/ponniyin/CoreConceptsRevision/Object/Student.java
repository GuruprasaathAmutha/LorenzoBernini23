package selvan.ponniyin.CoreConceptsRevision.Object;

import java.util.Objects;

public class Student implements Cloneable {

    String name;
    int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
