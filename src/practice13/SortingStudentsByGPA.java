package practice13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    // Сравниваем по GPA по убыванию
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // s2 - s1 → по убыванию
    }

    // Быстрая сортировка массива студентов по заданному компаратору
    public void quickSort(Student[] arr, int low, int high) {
        if (low >= high) return;

        int i = low;
        int j = high;
        Student pivot = arr[(low + high) / 2];

        while (i <= j) {
            while (compare(arr[i], pivot) < 0) {
                i++;
            }
            while (compare(arr[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (i < high) quickSort(arr, i, high);
    }

    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }

    // Тестовый main для задания 2
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов", 103, 4.1),
                new Student("Петров", 101, 3.7),
                new Student("Сидоров", 105, 4.8),
                new Student("Андреев", 102, 4.3),
                new Student("Смирнов", 104, 3.9)
        };

        System.out.println("До сортировки (по GPA):");
        printArray(students);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле быстрой сортировки (по GPA по убыванию):");
        printArray(students);
    }
}
