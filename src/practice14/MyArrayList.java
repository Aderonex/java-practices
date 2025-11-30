package practice14;

import java.util.Arrays;

public class MyArrayList<E> {

    private Object[] data; // внутренний массив
    private int size;      // текущее количество элементов

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // добавление в конец
    public void add(E element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    // вставка по индексу
    public void add(int index, E element) {
        checkPositionIndex(index);
        ensureCapacity(size + 1);
        // сдвигаем всё вправо
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    // получение по индексу
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkElementIndex(index);
        return (E) data[index];
    }

    // установка по индексу
    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        checkElementIndex(index);
        E old = (E) data[index];
        data[index] = element;
        return old;
    }

    // удаление по индексу
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkElementIndex(index);
        E old = (E) data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
        }
        data[--size] = null;
        return old;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(data.length * 2, minCapacity);
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
    }

    @Override
    public String toString() {
        Object[] actual = Arrays.copyOf(data, size);
        return Arrays.toString(actual);
    }
}
