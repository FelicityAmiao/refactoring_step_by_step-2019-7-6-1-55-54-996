package com.tws.refactoring;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliceTest {

    private Driver driver;
    private Police police;

    @Before
    public void setUp(int age) {
        this.driver = new Driver(age);
        this.police = new Police();
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19() {
        setUp(19);
        assertEquals(true, police.checkDriver(driver));
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_18() {
        setUp(18);
        assertEquals(true, police.checkDriver(driver));
    }

    @Test
    public void should_return_false_when_call_checkDriver_given_17() {
        setUp(17);
        boolean result = police.checkDriver(driver);
        assertEquals(false, result);
    }
}