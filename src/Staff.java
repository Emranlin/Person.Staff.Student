import java.util.Arrays;

public class Staff extends Person{
    private String school;
    private double salary;
    private Student[] students;

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", salary=" + salary +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
