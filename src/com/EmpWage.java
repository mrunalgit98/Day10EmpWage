package com;


import java.util.*;

//UC11 MANAGE MULTIPLE COMPANY EMPLOYEE WAGE
public class EmpWage  {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    // ArrayList to Store daily Wage along with Monthly Wage

    ArrayList<Integer> empDailyMonthlyTotalWage = new ArrayList<Integer>();

    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;

        while (totalWorkingDays < companyEmpWage.getNumOfWorkingDays() && totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    //    System.out.println("Employee is Present");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    //    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                    //    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        companyEmpWage.setTotalEmpWage( totalEmpHrs * companyEmpWage.empRatePerHour );
        System.out.println("Employee Monthly Wage of " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalEmpWage());
    }

    //Main Function
    public static void main(String[] args) {

        System.out.println("emp wage computation");
        EmpWage emp =new EmpWage();
        CompanyEmpWage[] company =new CompanyEmpWage[10]; //assign value to object
        company[0] =new CompanyEmpWage("dmart",40,20,100);
        emp.computeEmpWage(company[0]);
        company[1]=new CompanyEmpWage("relaince", 35,25,88);
        emp.computeEmpWage(company[1]);
            }
        }

