package practice13;

public class Student implements Comparable<Student> {

    private String name;      // ФИО/имя
    private int iDNumber;     // номер зачетки / ID
    private double gpa;       // средний балл (GPA)

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    // Задание 4: своя реализация Comparable
    // Сравниваем по iDNumber (по возрастанию)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }
}
