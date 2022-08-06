package ru.yandex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MontlyReport montlyReport = new MontlyReport();

        System.out.println("До считывания");
        System.out.println(montlyReport.monthlyRecords.size());

        montlyReport.createPort();

        System.out.println("после считывания");
        System.out.println(montlyReport.monthlyRecords.size());



    }


    public static String readFileContentsOrNull(String path)
    {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

}
