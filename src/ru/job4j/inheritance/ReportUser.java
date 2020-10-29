package ru.job4j.inheritance;

public class ReportUser {
    public static void main(String[] args) {
        JsonReports report = new JsonReports();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
