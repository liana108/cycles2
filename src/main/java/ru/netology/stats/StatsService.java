package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateMidAmount(int[] sales) {
        int sum = calculateSum(sales);
        return sum / sales.length;
    }


    public int findMax(int[] sales) {
        int numberMaxMonth = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                numberMaxMonth = i + 1;
            }
        }
        return numberMaxMonth;
    }

    public int findMin(int[] sales) {
        int numberMinMonth = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                numberMinMonth = i + 1;
            }
        }
        return numberMinMonth;
    }

    public int moreMidAmount(int[] sales) {
        int average = calculateMidAmount(sales);
        int sumMore = 0;
        for (int sale : sales) {
            if (sale > average) {
                sumMore += 1;
            }
        }
        return sumMore;
    }


    public int lessMidAmount(int[] sales) {
        int average = calculateMidAmount(sales);
        int sumLess = 0;
        for (int sale : sales) {
            if (sale < average) {
                sumLess += 1;
            }
        }
        return sumLess;
    }
}

