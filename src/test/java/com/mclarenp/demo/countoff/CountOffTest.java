/*
 * Copyright 2019 
 * All rights reserved.
 */
package com.mclarenp.demo.countoff;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

/**
 * <b><code>CountOffTest</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2019Äê5ÔÂ5ÈÕ
 * 
 * @author mclaren.p
 * @version 0.0.1
 * @since countoff 0.0.1
 */
public class CountOffTest {

    @Test
    public void testCountOff1() {
        List list = CountOff.getCountOffList(100);
        Assert.assertEquals("Fizz", String.valueOf(list.get(2)));
    }

    @Test
    public void testCountOff2() {
        List list = CountOff.getCountOffList(100);
        Assert.assertEquals("Buzz", list.get(4));
    }

    @Test
    public void testCountOff3() {
        List list = CountOff.getCountOffList(100);
        Assert.assertEquals("FizzBuzz", list.get(14));
    }

    @Test
    public void testCountOff4() {
        List list = CountOff.getCountOffList(100);
        Assert.assertEquals("16", String.valueOf(list.get(15)));
    }

    @Test
    public void testCountOff5() {
        List list = CountOff.getCountOffList(-5);
        Assert.assertEquals(0, list.size());
    }

}
