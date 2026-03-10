package com.example;

public class App {

    public static void main(String[] args) {

        String empName = "Rahul";
        double basicSalary = 50000;
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double tax = 0.05 * basicSalary;

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - tax;

        System.out.println("===== Employee Salary Slip =====");
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Tax (5%)      : " + tax);
        System.out.println("--------------------------------");
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);
    }

    public static double calculateNetSalary(double basicSalary) {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double tax = 0.05 * basicSalary;
        double grossSalary = basicSalary + hra + da;
        return grossSalary - tax;
    }
}
