package com;

class CompanyEmpWage {

    public String company=" ";
    public int empRatePerHour=0;
    public int numOfWorkingDays=0;
    public int maxHoursPerMonth=0;
    public int totalEmpWage=0;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    //GETTERS method to get variables
    public String getCompanyName(){
        return company;
    }
    public int getEmpRatePerHour(){
        return empRatePerHour;
    }

    public int getNumOfWorkingDays(){
        return numOfWorkingDays;
    }

    public int getMaxHoursPerMonth(){
        return maxHoursPerMonth;
    }

    public void setTotalEmpWage( int totalEmpWage ){
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage(){
        return totalEmpWage;
    }

}