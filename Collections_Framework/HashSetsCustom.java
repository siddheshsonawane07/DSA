package Collections_Framework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetsCustom {

    static class Student {
        String name;
        int rollno;

        public Student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollno=" + rollno +
                    '}';
        }

        //this enables developer to not allow user for multiple entries with certain criteria
        //here it is roll number
        //roll number cannot be repeated

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollno == student.rollno && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollno);
        }
    }

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("siddhesh", 07));
        studentSet.add(new Student("siddhesh", 07));
        studentSet.add(new Student("siddhesh", 1));
        System.out.println(studentSet);


    }
}
