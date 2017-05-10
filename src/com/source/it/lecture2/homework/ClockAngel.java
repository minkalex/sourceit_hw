package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 11;//1 hour - 30 degrees
        int mins = 30;//1 min - 6 degrees
        int result = 0;

        if (hours >= 0 && hours < 12) {
            if (mins >= 0 && mins < 60) {
                result = (Math.abs(mins * 6 - hours * 30) > 180) ? (360 - Math.abs(mins * 6 - hours * 30)) : Math.abs(mins * 6 - hours * 30);
                System.out.println("Angle between hours and minute narrows is " + result);
            } else {
                System.out.println("Invalid value of mins - " + mins + ". It must be in the range from 0 to 59.");
            }
        } else {
            System.out.println("Invalid value of hours - " + hours + ". It must be in the range from 0 to 11.");
        }
    }
}
