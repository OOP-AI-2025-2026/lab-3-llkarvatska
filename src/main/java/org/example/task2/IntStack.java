package org.example.task2;

import java.util.EmptyStackException;

public class IntStack {

    private int[] data;   // внутрішній масив
    private int size;     // кількість елементів у стеку

    // конструктор без параметрів
    public IntStack() {
        data = new int[10]; // початковий розмір масиву
        size = 0;
    }

    // додати елемент у стек
    public void push(int value) {
        if (size == data.length) {
            grow(); // розширюємо масив, якщо він заповнений
        }
        data[size++] = value;
    }

    // видалити елемент зі стеку і повернути його
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // можна було б return 0, але виняток правильніше
        }
        return data[--size];
    }

    // подивитись верхній елемент, не видаляючи
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[size - 1];
    }

    // повернути кількість елементів у стеку
    public int size() {
        return size;
    }

    // перевірка на порожність
    public boolean isEmpty() {
        return size == 0;
    }

    // очистити стек
    public void clear() {
        size = 0;
    }

    // розширення масиву при переповненні
    private void grow() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IntStack: [");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
