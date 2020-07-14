package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMidAmount() {
        int expected = 15;
        int actual = service.calculateMidAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMoreMidAmount() {
        int expected = 5;
        int actual = service.moreMidAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLessMidAmount() {
        int expected = 5;
        int actual = service.lessMidAmount(sales);
        assertEquals(expected, actual);
    }
}
