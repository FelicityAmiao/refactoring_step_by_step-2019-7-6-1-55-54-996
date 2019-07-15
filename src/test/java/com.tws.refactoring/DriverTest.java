package com.tws.refactoring;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Driver driver;

    @Before
    public void setUp(int age) {
        this.driver = new Driver(age);
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19() {
        setUp(19);
        assertEquals(true, driver.isLegalDriver());
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_18() {
        setUp(18);
        assertEquals(true, driver.isLegalDriver());
    }

    @Test
    public void should_return_false_when_call_checkDriver_given_17() {
        setUp(17);
        assertEquals(false, driver.isLegalDriver());
    }
}