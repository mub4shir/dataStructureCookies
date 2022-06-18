package com.datastructurecookies.arrays;

import java.util.Arrays;

/**
 * Implement a dynamic array
 * <p>
 * * Dynamic Array
 * : flexible array (resizable/mutable)
 * -> based on dynamically-allocated arrays
 * => a.k.a VECTOR in C++ STL
 * <p>
 * - append: amortized O(1)
 * -> worst-case O(n) bcuz of copying elements
 * - lookup: O(1)
 * -> random access (by index)
 * - insert: O(n)
 * -> need to scoot elements
 * - delete: O(n)
 * -> need to scoot elements
 * <p>
 * ** What I learned
 * <p>
 * * how to define dynamic array (using 'new')
 * <p>
 * * how to SCOOT ELEMENTS
 * - when scooting elements to the RIGHT (for insertion)
 * -> start from end of array to position
 * -> use arr[i] = arr[i - 1] or arr[i + 1] = arr[i]
 * <p>
 * - when scooting elements to the LEFT (for deletion)
 * -> start from position to end of array
 * -> use arr[i] = arr[i + 1] or arr[i - 1] = arr[i]
 */


public class DynamicArray {
    private Object arr[];
    private int size;
    private int capacity;

    // constructor method
    public DynamicArray(int capacity) {
        this.arr = new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // return value at index
    public Object valueAt(int index) {
        if (index >= capacity) {
            throw new IllegalArgumentException("index out of boundary");

        }
        return arr[index];

    }

    // push value to end of array (append)
    public void pushBack(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    // insert value at index
    public void insertAt(int index, int value) {
        if (index >= capacity || index < 0) {
            throw new IllegalArgumentException("index out of bpundary");
        }
        if (size == capacity) {
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    public void removeAt(int index) {
        if (index >= capacity || index < 0) {
            throw new IllegalArgumentException("index out of bpundary");
        }
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;

    }

    // resize array to twice the capacity
    public void resize() {
        this.capacity *= 2;
        Object[] tempArr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public void printArray() {
        System.out.println(Arrays.stream(arr).toList());
//        for (var i = 0; i < arraySize(); i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public int arraySize() {
        return this.size;
    }

    public int arrayCapacity() {
        return this.capacity;
    }
}
