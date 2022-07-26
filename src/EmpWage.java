public class EmpWage {
    //Constants
    public static final int IS_FULL_TIME=2;
    public static final int IS_PART_TIME=1;
    //Instance Variable
    private String companyName;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWage(String companyName, int empRatePerHour , int numOfWorkingDays, int maxHoursPerMonth){
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int computeEmpWage() {
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
        totalEmpWage = totalEmpHours * empRatePerHour;
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWage KFC = new EmpWage("Dominos", 15, 25, 100);
        EmpWage MCD = new EmpWage("PizzaHut", 20, 20, 100);
        KFC.computeEmpWage();
        System.out.println("KFC Emp salary "+KFC.totalEmpWage);
        MCD.computeEmpWage();
        System.out.println("MCD Emp salary "+MCD.totalEmpWage);

    }
}
