package com.datastructurecookies.arrays;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

//        var arr = new DynamicArray(10);

//        arr.pushBack(1);
//        arr.pushBack(2);
//
//
//        System.out.println();
//        arr.insertAt(0, 999);
//        arr.removeAt(0);
//        for (int i = 1; i <=100 ; i++) {
//            arr.pushBack(i);
//        }
//        arr.insertAt(1,99999999);
//
//        arr.removeAt(1);
//        arr.printArray();
//        System.out.println("arraySize(): "+arr.arraySize());
//        System.out.println("arrayCapacity() :"+ arr.arrayCapacity());

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.print();
        System.out.println("Maximum Number " + numbers.max());
        Array  other =  new Array(5);
        other.insert(10);
        other.insert(20);
        other.insert(1);
        other.insert(50);
        Array ans = numbers.intersect(other);
        ans.print();



        // Dynamic Array
        Vector<Integer> vec = new Vector<>(); //
        ArrayList<Integer> arrayList = new ArrayList<>();

        // both are defined in java.util package bu they are slightly different
        // the Vector class will grow 100% of its size every time it gets full
        // whereas the arrayList will grow 50%
        // also all the methods in the vector class are synchronized (only a single thread can access that method)
        // in other words if you have multithreaded application where multiple threads are gonna work with this collection
        // then you are not gonna be able to use vector class
        // and methods of the ArrayList are not synchronized
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.remove(0);
//        arrayList.indexOf(20);
//        arrayList.lastIndexOf(30);
//        arrayList.contains(20);
//        arrayList.size();
//        arrayList.toArray();
//
//        System.out.println(arrayList);

    }
}
