package com;

import java.util.*;

// uc 12 Refactor to have list of multiple companies to  manage Employee Wage .

public class EmpWage  {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        while (totalWorkingDays < companyEmpWage.getNumOfWorkingDays() && totalEmpHrs <=  companyEmpWage.getMaxHoursPerMonth()) {

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
        System.out.println(" Monthly Wage of " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalEmpWage());
    }
    //Main Function
    public static void main(String[] args) {
        System.out.println("EMPLOYEE WAGE COMPUTATION");
        EmpWage emp = new EmpWage();
        //ArrayList of Multiple Companies Wage

        ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();
        // assign value to object of Companyempwage
        company.add( new CompanyEmpWage("dMART", 40, 20, 100));
        emp.computeEmpWage(company.get(0));
        company.add( new CompanyEmpWage("Croma", 30, 22, 120));
        emp.computeEmpWage(company.get(1));
        company.add( new CompanyEmpWage("Reliance", 45, 18, 90));
        emp.computeEmpWage(company.get(2));
    }
}

