
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricityBillCalculatorTest {

    @Test
    void testZeroUnits() {
        assertEquals(0.0,
            ElectricityBillCalculator.calculateBill(0), 0.001);
    }

    @Test
    void test50Units() {
        assertEquals(75.0,
            ElectricityBillCalculator.calculateBill(50), 0.001);
    }

    @Test
    void test100Units() {
        assertEquals(150.0,
            ElectricityBillCalculator.calculateBill(100), 0.001);
    }

    @Test
    void test150Units() {
        assertEquals(275.0,
            ElectricityBillCalculator.calculateBill(150), 0.001);
    }

    @Test
    void test200Units() {
        assertEquals(400.0,
            ElectricityBillCalculator.calculateBill(200), 0.001);
    }

    @Test
    void test250Units() {
        assertEquals(600.0,
            ElectricityBillCalculator.calculateBill(250), 0.001);
    }

    @Test
    void test300Units() {
        assertEquals(800.0,
            ElectricityBillCalculator.calculateBill(300), 0.001);
    }

    @Test
    void test350Units() {
        assertEquals(1100.0,
            ElectricityBillCalculator.calculateBill(350), 0.001);
    }

    @Test
    void testNegativeUnits() {
        assertThrows(IllegalArgumentException.class,
            () -> ElectricityBillCalculator.calculateBill(-10));
    }
}
