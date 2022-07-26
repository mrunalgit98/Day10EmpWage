public class EmpWage {
    final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

     String company;
      int empRate;
      int numOFDays;
      int maxHours;
    private int empWagePerMonth;

    public EmpWage(String company, int empRate, int numOFDays, int maxHours) {
        this.company = company;
        this.empRate = empRate;
        this.numOFDays = numOFDays;
        this.maxHours = maxHours;
    }
    public void calculateEmpWageForCompany() {

        int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

        while (totalEmpHours <= maxHours && totalWorkingdays < numOFDays) {

            totalWorkingdays++;
            int empType = (int) Math.floor(Math.random() * 10) % 3;

            switch (empType) {
                case IS_FULL_TIME:
                    System.out.println("Employee Doing Full Time:");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee Doing Part Time:");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee Is Absent:");
                    empHrs = 0;
            }

            totalEmpHours += empHrs;
            int empWagePerDay = empHrs * empRate;
            empWagePerMonth += empWagePerDay;
            System.out.println("Emp Wage Per Day : " + empWagePerDay);
        }

    }

    public static void main(String[] args) {

        System.out.println(" Employee Wage Computation");
        EmpWage S1 = new EmpWage("EMP1", 20, 2, 10);

        EmpWage S2 = new EmpWage("EMP2", 40, 5, 20);

        S1.calculateEmpWageForCompany();
        System.out.println(S1);
        System.out.println();

        S2.calculateEmpWageForCompany();
        System.out.println(S2);

    }
}
