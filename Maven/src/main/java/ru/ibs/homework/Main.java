package ru.ibs.homework;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println("1) " + greeter.helloWorld());
        System.out.println("2) " + StringUtils.upperCase(greeter.helloWorld()));
    }
}
