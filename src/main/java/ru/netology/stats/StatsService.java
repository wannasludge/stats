package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] months) {
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum;
    }

    public int calculateAverage(int[] months) {
        StatsService service = new StatsService();
        int sum = service.calculateSum(months);
        int average = sum / (months.length);
        return average;
    }

    public int calculateMax(int[] months) {
        int maxMonth = 0;
        int numberOfMonth = 0;
        for (int month : months) {
            if (month >= months[maxMonth]) {
                maxMonth = numberOfMonth;
            }
            numberOfMonth += 1;
        }
        return maxMonth + 1;
    }

    public int calculateMin(int[] months) {
        int minMonth = 0;
        int numberOfMonth = 0;
        for (int month : months) {
            if (month <= months[minMonth]) {
                minMonth = numberOfMonth;
            }
            numberOfMonth += 1;
        }
        return minMonth + 1;
    }

    public int calculateLowerThanAverage(int[] months) {
        StatsService service = new StatsService();
        int average = service.calculateAverage(months);
        int lowerThanAverage = 0;
        for (int month : months) {
            if (month < average) {
                lowerThanAverage += 1;
            }
        }
        return lowerThanAverage;
    }

    public int calculateHigherThanAverage(int[] months) {
        StatsService service = new StatsService();
        int average = service.calculateAverage(months);
        int higherThanAverage = 0;
        for (int month : months) {
            if (month < average) {
                higherThanAverage += 1;
            }
        }
        return higherThanAverage;
    }
}