package com.datastructurecookies;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (var first : numbers)
            for (var second : numbers)
                System.out.println(first + ", " + second);



    }
}
