package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculate(months);
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(months);
        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMax(months);
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMin(months);
        assertEquals(expected, actual);
    }

    @Test
    void lowerThanAverage() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateLowerThanAverage(months);
        assertEquals(expected, actual);
    }

    @Test
    void higherThanAverage() {
        StatsService service = new StatsService();
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateHigherThanAverage(months);
        assertEquals(expected, actual);
    }
}