public class EmpWage {
    public static final int IS_FULL_TIME=2;
    public static final int IS_PART_TIME=1;

    public static int employeeWageComputation(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        int empHour = 0, totalEmpHours = 0, totalWorkingDays = 0;
        while(totalEmpHours <=maxHoursPerMonth && totalWorkingDays< numOfWorkingDays){
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch(empCheck)	{
                case IS_FULL_TIME:
                    empHour = 8;
                    break;
                case IS_PART_TIME:
                    empHour = 4;
                    break;
                default:
                    empHour =0;
            }
            totalEmpHours = totalEmpHours + empHour;
            totalWorkingDays++;
            System.out.println("Day : "+totalWorkingDays+" Emp Hours: "+empHour);

        }
        int totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Total Emp Wage for Company: "+companyName+" is:"+totalEmpWage );
        return totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        employeeWageComputation("kfc", 15, 25, 100);
        employeeWageComputation("mcd", 20, 20, 100);
    }
}
