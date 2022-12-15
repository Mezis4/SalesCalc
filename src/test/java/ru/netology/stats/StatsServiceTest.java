package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCountSalesSummary() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSummary = 180;
        int actualSummary = service.salesSummary(sales);

        Assertions.assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void shouldCountAverageSummary() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverage = 15;
        int actualAverage = service.averageSummary(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldShowMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldShowMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCountMinMonthSum() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSummary = 5;
        int actualSummary = service.minMonthSum(sales);

        Assertions.assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void shouldCountMaxMonthSum() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSummary = 5;
        int actualSummary = service.maxMonthSum(sales);

        Assertions.assertEquals(expectedSummary, actualSummary);
    }
}