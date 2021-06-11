package ru.ibs.homework;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(StringUtils.upperCase(greeter.helloWorld()));
    }
}
