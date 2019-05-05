/*
 * Copyright 2019
 * All rights reserved.
 */
package com.mclarenp.demo.countoff;

import java.util.LinkedList;
import java.util.List;

/**
 * <b><code>CountOff</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2019Äê5ÔÂ5ÈÕ
 * 
 * @author mclaren.p
 * @version 0.0.1
 * @since countoff 0.0.1
 */
public class CountOff {

    private static final String FIZZ = "Fizz";

    private static final String BUZZ = "Buzz";

    private static final String FIZZBUZZ = "FizzBuzz";

    private static final String THREESTR = "3";

    private static final String FIVESTR = "5";

    private static final int THREE = 3;

    private static final int FIVE = 5;

    /**
     * return a list from 1 to $number, but for multiples of three change to
     * "Fizz", for multiples of five change to "Buzz", for multiples of three
     * and five change to "FizzBuzz".
     * 
     * @param number
     * @return
     * @since countoff 0.0.1
     */
    public static List getCountOffList(int number, CountOffCallback callback) {
        List list = new LinkedList();
        if (number <= 0) {
            return list;
        }

        for (int i = 1; i <= number; i++) {
            list.add((callback.isFizzBuzz(i) ? FIZZBUZZ
                    : (callback.isFizz(i) ? FIZZ
                            : (callback.isBuzz(i) ? BUZZ : i))));
        }

        return list;
    }

    /**
     * return a list from 1 to $number, but for multiples of three change to
     * "Fizz", for multiples of five change to "Buzz", for multiples of three
     * and five change to "FizzBuzz".
     * 
     * @param number
     * @param callback
     * @return
     * @since countoff 0.0.1
     */
    public static List getCountOffListStage1(int size) {
        return getCountOffList(size, new CountOffCallback() {

            public boolean isFizz(int number) {
                return number % THREE == 0;
            }

            public boolean isBuzz(int number) {
                return number % FIVE == 0;
            }

            public boolean isFizzBuzz(int number) {
                return number % THREE == 0 && number % FIVE == 0;
            }

        });

    }

    /**
     * return a list from 1 to $number, but for multiples of three or has three
     * in it change to "Fizz", for multiples of five or has five in it change to
     * "Buzz", for multiples of three or five or has three in it or has five in
     * it change to "FizzBuzz".
     * 
     * @param number
     * @return
     * @since countoff 0.0.1
     */
    public static List getCountOffListStage2(int size) {
        return getCountOffList(size, new CountOffCallback() {

            public boolean isFizz(int number) {
                return number % THREE == 0
                        || containNumber(String.valueOf(number), THREESTR);
            }

            public boolean isBuzz(int number) {
                return number % FIVE == 0
                        || containNumber(String.valueOf(number), FIVESTR);
            }

            public boolean isFizzBuzz(int number) {
                return number % THREE == 0 || number % FIVE == 0
                        || containNumber(String.valueOf(number), THREESTR)
                        || containNumber(String.valueOf(number), FIVESTR);
            }

        });

    }

    /**
     * print a list method_comment(use third person)
     * 
     * @param list
     * @since countoff 0.0.1
     */
    public static void printIt(List list) {
        if (null == list || list.isEmpty()) {
            return;
        }
        for (Object object : list) {
            System.out.println(object);
        }
    }

    /**
     * @param numberStr
     * @param number
     * @return
     * @since countoff 0.0.1
     */
    private static boolean containNumber(String numberStr, String number) {
        return numberStr.indexOf(number) > 0;
    }
}
