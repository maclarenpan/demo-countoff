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

    private static final String MultipleOf3Str = "Fizz";

    private static final String MultipleOf5Str = "Buzz";

    private static final String MultipleOf3And5Str = "FizzBuzz";

    /**
     * return a list from 1 to $number, but for multiples of three change to "Fizz", 
     * for multiples of five change to "Buzz", for multiples of three and five change to "FizzBuzz".
     * @param number
     * @return
     * @since countoff 0.0.1
     */
    public static List getCountOffList(int number) {
        List list = new LinkedList();
        if (number <= 0) {
            return list;
        }

        for (int i = 1; i <= number; i++) {
            list.add(((i % 3 == 0 && i % 5 == 0) ? MultipleOf3And5Str
                    : (i % 3 == 0 ? MultipleOf3Str
                            : (i % 5 == 0 ? MultipleOf5Str : i))));
        }
        
        return list;
    }
    
    /**
     * print a list
     * method_comment(use third person)
     * @param list
     * @since countoff 0.0.1
     */
    public static void printIt(List list) {
        if (null == list || list.isEmpty()) {
            return ;
        }
        for (Object object : list) {
            System.out.println(object);
        }
    }
    
}
