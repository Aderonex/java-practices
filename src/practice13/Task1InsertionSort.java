package practice13;

public class Task1InsertionSort {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Иванов", 103, 4.1),
                new Student("Петров", 101, 3.7),
                new Student("Сидоров", 105, 4.8),
                new Student("Андреев", 102, 4.3),
                new Student("Смирнов", 104, 3.9)
        };

        System.out.println("До сортировки (по iDNumber):");
        printArray(students);

        insertionSort(students);

        System.out.println("\nПосле сортировки вставками (по iDNumber):");
        printArray(students);
    }

    // Сортировка вставками массива студентов по iDNumber
    private static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            // так как Student реализует Comparable — используем compareTo()
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
