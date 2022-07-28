package com;

import java.util.*;

// uc 13 daily wage along with total wage

public class EmpWage {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    ArrayList<Integer> empDailyMonthlyTotalWage = new ArrayList<Integer>();

    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int empDailyWage = 0;
        while (totalWorkingDays < companyEmpWage.getNumOfWorkingDays() && totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                      System.out.println("Employee is Present");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                   System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                      System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
            empDailyWage = empHrs * companyEmpWage.getEmpRatePerHour();
            System.out.println("day " + totalWorkingDays + "wage " + empDailyWage);
        }
        totalEmpWage = (totalEmpHrs * companyEmpWage.getEmpRatePerHour());
        empDailyMonthlyTotalWage.add(totalEmpWage);
        companyEmpWage.setTotalEmpWage(totalEmpHrs);
        System.out.println(" Monthly Wage of " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalEmpWage());
    }


    public static void main(String[] args) {
        System.out.println("EMPLOYEE WAGE COMPUTATION");
        EmpWage emp = new EmpWage();


        ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();
        while (true) {
            System.out.println("please enter your choice");
            System.out.println(" 1 .Dmart");
            System.out.println("2. reliance");
            System.out.println("3. croma");


            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    company.add(new CompanyEmpWage("Dmart", 40, 25, 99));
                    emp.computeEmpWage(company.get(0));
                    System.out.println("total wage is" + company.get(0).getTotalEmpWage());
                    break;
                case 2:
                    company.add(new CompanyEmpWage("Reliance", 32, 27, 100));
                    emp.computeEmpWage(company.get(1));
                    System.out.println(" total wage is " + company.get(1).getTotalEmpWage());
                    break;
                case 3:
                    company.add(new CompanyEmpWage("croma", 45, 18, 130));
                    emp.computeEmpWage(company.get(2));
                    System.out.println("total wage is " + company.get(2).getTotalEmpWage());
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}


