package ru.yandex;

import java.util.ArrayList;

public class MontlyReport {
    ArrayList<MonthlyRecord> monthlyRecords = new ArrayList<>();


    void createPort() {

        for (int i = 1; i < 3; i++) {
            buildReport(i);
        }
//        System.out.println(monthlyRecords.size());
    }

    private void buildReport(int monthNumber) {
        String content = Util.readFileContentsOrNull("resources/m.20210" + monthNumber + ".csv");

        String[] lines = content.split("\n");
        for (int i = 1; i < lines.length; i++) {
            String[] line = lines[i].split(",");

            int sumOfOne = Integer.parseInt(line[3]);
            int quantity = Integer.parseInt(line[2]);
            boolean isExpense = Boolean.parseBoolean(line[1]);
            String itemName = line[0];

            MonthlyRecord monthlyRecord = new MonthlyRecord(sumOfOne, quantity, isExpense, itemName);

            monthlyRecords.add(monthlyRecord);
        }

    }

}
