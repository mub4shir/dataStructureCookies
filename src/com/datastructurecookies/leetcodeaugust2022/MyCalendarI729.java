package com.datastructurecookies.leetcodeaugust2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCalendarI729 {
    private List<int[]> calendar;

    public MyCalendarI729() {
        calendar = new ArrayList();
    }

    public boolean book(int start, int end) {
        for (int[] iv : calendar)
            if (iv[0] < end && start < iv[1]) return false;
        calendar.add(new int[]{start, end});
        return true;
    }

    public List<int[]> getCalendar() {
        return calendar;
    }

    public static void main(String[] args) {
        MyCalendarI729 obj = new MyCalendarI729();
        boolean[] bookingStatus = new boolean[406];
        for (int i = 10, j = 0; i <= 1000; i += 10, j++) {
            bookingStatus[j] = obj.book(i, i + 30);
        }
        var res = obj.getCalendar();
        System.out.println(Arrays.toString(bookingStatus));

        System.out.println(Arrays.deepToString(res.toArray()));

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

