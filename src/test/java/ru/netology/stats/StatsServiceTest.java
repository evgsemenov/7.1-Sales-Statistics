package ru.netology.stats;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {

//    @CsvSource(
//            value = {
//                    "January, 8",
//                    "February, 15",
//                    "March, 13",
//                    "April, 15",
//                    "May, 17",
//                    "June, 20",
//                    "July, 19",
//                    "August, 20",
//                    "September, 7",
//                    "October, 14",
//                    "November, 14",
//                    "December, 18"
//            }
//            )


    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Массив тестовых данных с продажами по месяцам

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.avgSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsBelowAvgSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsAboveAvgSales(sales);
        assertEquals(expected, actual);
    }
}