package ru.netology.stats;

public class StatsService {

    public int salesSummary(long[] sales) {
        int summary = 0;
        for (long value : sales) {
            summary = (int) (summary + value);
        }
        return summary;
    }

    public int averageSummary(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            double summary = 0;
            for (long value : sales) {
                summary = summary + value;
            }
            average = (int) (summary / sales.length);
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minMonthSum(long[] sales) {
        int minMonth = 0;
        int average = 0;
        if (sales.length > 0) {
            double summary = 0;
            for (long value : sales) {
                summary = summary + value;
            }
            average = (int) (summary / sales.length);

            for (long sale : sales) {
                if (sale < average) {
                    minMonth = minMonth + 1;
                }
            }
        }
        return minMonth;
    }

    public int maxMonthSum(long[] sales) {
        int maxMonth = 0;
        int average = 0;
        if (sales.length > 0) {
            double summary = 0;
            for (long value : sales) {
                summary = summary + value;
            }
            average = (int) (summary / sales.length);

            for (long sale : sales) {
                if (sale > average) {
                    maxMonth = maxMonth + 1;
                }
            }
        }
        return maxMonth;
    }
}
