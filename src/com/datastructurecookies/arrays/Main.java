package com.datastructurecookies.arrays;

public class Main {
    public static void main(String[] args) {

        var arr = new DynamicArray(10);

//        arr.pushBack(1);
//        arr.pushBack(2);
//
//
//        System.out.println();
//        arr.insertAt(0, 999);
//        arr.removeAt(0);
        for (int i = 1; i <=100 ; i++) {
            arr.pushBack(i);
        }
        arr.insertAt(1,99999999);

        arr.removeAt(1);
        arr.printArray();
        System.out.println("arraySize(): "+arr.arraySize());
        System.out.println("arrayCapacity() :"+ arr.arrayCapacity());


    }
}
