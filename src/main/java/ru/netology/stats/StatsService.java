package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {  //Определение месяца минимальных продаж
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Месяц с наименьшими продажами" + minMonth);
        return minMonth + 1;
    }


    public int maxSales(int[] sales) {  //Определение месяца максимальных продаж
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {    //Определение суммы продаж за все месяцы
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(int[] sales) {   //Определение среднеарифметической суммы продаж в месяц
        int avgSales = sumSales(sales) / sales.length;
        return avgSales;

    }

    public int monthsBelowAvgSales(int[] sales) {  //Определение количества месяцев с продажами ниже среднеарифметической в месяц
        int belowAvgMonth = 0;
        int month = 0;
        int avgSales = sumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avgSales) {
                belowAvgMonth += 1;
            }
            month = month + 1;
        }
        return belowAvgMonth;
    }

    public int monthsAboveAvgSales(int[] sales) {   //Определение количества месяцев с продажами выше среднеарифметической в месяц
        int aboveAvgMonth = 0;
        int month = 0;
        int avgSales = sumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avgSales) {
                aboveAvgMonth += 1;
            }
            month = month + 1;
        }
        return aboveAvgMonth;
    }
}

