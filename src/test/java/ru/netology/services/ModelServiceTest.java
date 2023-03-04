package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelServiceTest {
    @Test
    public void testIncome10Expenses3threshold20() {
        ModelService service = new ModelService();

        int income;
        int expenses;
        int threshold;

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncome100Expenses60threshold150() {
        ModelService service = new ModelService();

        int income;
        int expenses;
        int threshold;

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}