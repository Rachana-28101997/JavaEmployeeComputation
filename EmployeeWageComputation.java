public class EmployeeWageComputation
{
        static final int PRESENT=1;
        static final int IS_PRESENT=1,WAGE_PER_HR=20;
        public static void main(String[] args)
        {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION")

                int random=(int)Math.floor(Math.random()*10)%2;
                int workingHrs=0,salary;

                if(PRESENT==random)
                if(IS_PRESENT==random)
                {
                        System.out.println("Employee Is Present ");
                        workingHrs=8;
                }
                else
                        System.out.println("Employee Is Absent ");
                salary=WAGE_PER_HR*workingHrs;

                System.out.println("Employee Earns "+salary);

        }
}
