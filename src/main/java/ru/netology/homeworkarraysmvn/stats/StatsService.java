package ru.netology.homeworkarraysmvn.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i;// запомним его как максимальный

            }
        }
        return maxMonth + 1;
    }

    public int amount(long[] sales) { // сумма всех продаж

        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += (long) sales[i];

        }

        return amount;
    }

    public int averageamount(long[] sales) { // средняя сумма продаж за все месяцы

        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += (long) sales[i];

        }
        return amount / sales.length;
    }


    public int moreaverage(long[] sales) { // месяца с продажами выше среднего
        int averageamount = averageamount(sales);

        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageamount < sales[i]) {
                moreSales++;

            }
        }
        return moreSales;
    }

    public int lessaverage(long[] sales) {  // месяца с продажами ниже среднего
        int averageamount = averageamount(sales);

        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageamount > sales[i]) {
                lessSales++;

            }
        }
        return lessSales;

    }
}