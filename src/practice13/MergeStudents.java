package practice13;

public class MergeStudents {

    public static void main(String[] args) {

        Student[] group1 = {
                new Student("Иванов", 103, 4.1),
                new Student("Петров", 101, 3.7),
                new Student("Сидоров", 105, 4.8)
        };

        Student[] group2 = {
                new Student("Андреев", 110, 4.2),
                new Student("Смирнов", 104, 3.9),
                new Student("Фёдоров", 108, 4.5)
        };

        // объединяем два массива в один
        Student[] all = mergeArrays(group1, group2);

        System.out.println("Объединённый список ДО сортировки (по iDNumber):");
        printArray(all);

        // сортировка слиянием по compareTo (т.е. по iDNumber)
        Student[] sorted = mergeSort(all);

        System.out.println("\nОбъединённый список ПОСЛЕ сортировки (Merge Sort по iDNumber):");
        printArray(sorted);
    }

    private static Student[] mergeArrays(Student[] a, Student[] b) {
        Student[] res = new Student[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        return res;
    }

    // Рекурсивная сортировка слиянием
    public static Student[] mergeSort(Student[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static Student[] merge(Student[] left, Student[] right) {
        Student[] res = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            // используем compareTo из Student (по iDNumber)
            if (left[i].compareTo(right[j]) <= 0) {
                res[k++] = left[i++];
            } else {
                res[k++] = right[j++];
            }
        }

        while (i < left.length) {
            res[k++] = left[i++];
        }
        while (j < right.length) {
            res[k++] = right[j++];
        }

        return res;
    }

    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
