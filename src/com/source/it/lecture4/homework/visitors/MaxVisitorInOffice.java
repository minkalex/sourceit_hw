package com.source.it.lecture4.homework.visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOffice {
    public static void main(String[] args) {
        int counter = 1;
        long visitorNumber = 1L;
        int maxVisitorAtOnce = 1;
        Visitor[] visitors = Visitor.createVisitors();
        Arrays.sort(visitors, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor o1, Visitor o2) {
                return o1.getComeTime() > o2.getComeTime() ? 1 : -1;
            }
        });
        for (Visitor visitor : visitors) {
            System.out.println("Come " + new Date(visitor.getComeTime()));
            System.out.println("Leave " + new Date(visitor.getLeaveTime()));
        }

        long[][] visits = new long[3][visitors.length * 2];
        long[] sortedTime = new long[visitors.length * 2];
        long[][] sortedVisits = new long[3][visitors.length * 2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < visitors.length * 2; j += 2) {
                if (i == 0) {
                    visits[i][j] = visitorNumber;
                    visits[i][j + 1] = visitorNumber;
                    visitorNumber++;
                }
                if (i == 1) {
                    visits[i][j] = visitors[j / 2].getComeTime();
                    visits[i][j + 1] = visitors[j / 2].getLeaveTime();
                }
                if (i == 2) {
                    visits[i][j] = 1L;//come
                    visits[i][j + 1] = 0L;//leave
                }
            }
        }
        for (int i = 0; i < sortedTime.length; i++) {
            sortedTime[i] = visits[1][i];
        }
        Arrays.sort(sortedTime);
        for (int i = 0; i < sortedTime.length; i++) {
            for (int j = 0; j < sortedTime.length; j++) {
                if (sortedTime[i] == visits[1][j]) {
                    sortedVisits[0][i] = visits[0][j];
                    sortedVisits[1][i] = visits[1][j];
                    sortedVisits[2][i] = visits[2][j];
                }
            }
        }
        for (int i = 1; i < sortedTime.length; i++) {
            if (sortedVisits[2][i] == 1) {
                counter++;
            } else {
                if (counter > maxVisitorAtOnce) {
                    maxVisitorAtOnce = counter;
                }
                counter = 0;
            }
        }

        System.out.println("Max visitors was " + maxVisitorAtOnce);
    }
}
