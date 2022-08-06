package ru.yandex;

public class MonthlyRecord {
    int sumOfOne;
    int quantity;
    boolean isExpense;
    String itemName;

    public MonthlyRecord(int sumOfOne, int quantity, boolean isExpense, String itemName) {
        this.sumOfOne = sumOfOne;
        this.quantity = quantity;
        this.isExpense = isExpense;
        this.itemName = itemName;
    }
}
