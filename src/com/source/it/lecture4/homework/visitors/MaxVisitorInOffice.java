package com.source.it.lecture4.homework.visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOffice {
    public static void main(String[] args) {
        int counter = 1;
        Visitor[] visitors = Visitor.createVisitors();
        Arrays.sort(visitors, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor o1, Visitor o2) {
                return o1.getComeTime() > o2.getComeTime() ? 1 : -1;
            }
        });
        int[] arrayOfCounters = new int[visitors.length];
        for (Visitor visitor : visitors) {
            System.out.println("Come " + new Date(visitor.getComeTime()));
            System.out.println("Leave " + new Date(visitor.getLeaveTime()));
        }

        int maxVisitorAtOnce = 0;
        for (int i = 0; i < visitors.length; i++) {
            for (int j = 0; j < visitors.length; j++) {
                if ((visitors[j].getComeTime() > visitors[i].getComeTime() && visitors[j].getComeTime() < visitors[i].getLeaveTime())
                        || (visitors[j].getLeaveTime() > visitors[i].getComeTime() && visitors[j].getLeaveTime() < visitors[i].getLeaveTime())
                        || (visitors[j].getComeTime() < visitors[i].getComeTime() && visitors[j].getLeaveTime() > visitors[i].getLeaveTime())) {
                    counter++;
                }
            }
            arrayOfCounters[i] = counter;
            counter = 1;
        }
        for (int i = 0; i < arrayOfCounters.length; i++) {
            if (arrayOfCounters[i] >= maxVisitorAtOnce) {
                maxVisitorAtOnce = arrayOfCounters[i];
            }
        }
        System.out.println("Max visitors was " + maxVisitorAtOnce);
    }
}
