package bean;

import java.util.Objects;

/**
 * @author wbj
 * @create 2022-11-24 22:50
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, school);
    }
}
