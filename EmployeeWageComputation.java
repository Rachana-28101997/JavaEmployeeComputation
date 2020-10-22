public class EmployeeWageComputation {
	static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;

	public void computeEmpWage(String company, int wagePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
		int workingHrs = 0, totalSalary = 0, totalWorkingHrs = 0, totalWorkingDays = 0;
		while (totalWorkingDays < numOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth) {
			totalWorkingDays++;
			int random = (int) Math.floor(Math.random() * 10) % 3;
			while (totalWorkingDays < numOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth) {
				totalWorkingDays++;

				switch (random) {
				case IS_PART_TIME:
					workingHrs = 4;
					break;
				case IS_FULL_TIME:
					workingHrs = 8;
					break;
				default:
					workingHrs = 0;
				}
				totalWorkingHrs += workingHrs;
				System.out
						.println("Emp totalWorkingHrs:" + totalWorkingHrs + "Emp totalWorkingDays:" + totalWorkingDays);
			}
			totalSalary = totalWorkingHrs * wagePerHr;
			switch (random) {
			case IS_PART_TIME:
				workingHrs = 4;
				break;
			case IS_FULL_TIME:
				workingHrs = 8;
				break;
			default:
				workingHrs = 0;
			}
			totalWorkingHrs += workingHrs;
			System.out.println("Emp totalWorkingHrs:" + totalWorkingHrs + "Emp totalWorkingDays:" + totalWorkingDays);
		}
		totalSalary = totalWorkingHrs * wagePerHr;

		System.out.println("Employee Wage For Company: " + company + " is: " + totalSalary);
		System.out.println("Employee Wage For Company: " + company + " is: " + totalSalary);
	}

	public static void main(String[] args) {
		EmployeeWageComputation emp = new EmployeeWageComputation();

		emp.computeEmpWage("HP", 20, 20, 50);
		emp.computeEmpWage("BridgeLabs", 30, 20, 50);
		emp.computeEmpWage("HP", 20, 20, 50);
		emp.computeEmpWage("BridgeLabs", 30, 20, 50);

	}
}
