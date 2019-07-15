package com.tws.refactoring;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Driver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new Driver();
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19() {
        driver.setAge(19);
        assertEquals(true, driver.isLegalDriver());
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_18() {
        driver.setAge(18);
        assertEquals(true, driver.isLegalDriver());
    }

    @Test
    public void should_return_false_when_call_checkDriver_given_17() {
        driver.setAge(17);
        assertEquals(false, driver.isLegalDriver());
    }
}