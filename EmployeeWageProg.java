public class EmployeeWageProg
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmployeeWage[] companyEmpWageArray;
	
	public EmployeeWageProg() {
		companyEmpWageArray = new CompanyEmployeeWage[5];
	}
			
	private void addCompanyEmpWage(String company, int wagePerHour, int maxDays,int maxHours) {
		companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(company, wagePerHour, maxDays, maxHours);
			
		numOfCompany++;
	}
	
	private void calcEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			int totalEmpWage = this.calcEmpWage(companyEmpWageArray[i]);
			
			System.out.println("Total earnings for the employee for the company : "+ companyEmpWageArray[i].company+" is: "+ totalEmpWage);
		}
	}
	
	
	private int calcEmpWage(CompanyEmployeeWage companyEmployeeWage) {
			
	//		Variables
	int attendance, perDayWage=0,workedHours=0,day=0;
	int totalAttendance=0,totalWorkedHours=0;
	
	//computation
	while(totalAttendance <= companyEmployeeWage.maxDays  && totalWorkedHours <= companyEmployeeWage.maxHours)
		{
		totalAttendance++;
		attendance=(int)Math.floor(Math.random()*10)%3;
		switch(attendance)
			{
				case IS_FULL_TIME: 
					{
						workedHours=8;
						break;
					}
				case IS_PART_TIME: 
					{
						workedHours=4;
						break;
					}
				default:
					{
						workedHours=0;
						
					} 
			}		
			totalWorkedHours = totalWorkedHours + workedHours;
			System.out.println("Day: " +totalAttendance + "Total worked hours: "+ totalWorkedHours);
		}
		int totalEmpWage = totalWorkedHours * companyEmployeeWage.wagePerHour;
		return totalEmpWage;
		}
	
		public static void main(String[] args) {
				
			EmployeeWageProg empWageBuilder = new EmployeeWageProg();
			empWageBuilder.addCompanyEmpWage("DMart",20,2,10); 
			empWageBuilder.addCompanyEmpWage("Relaince",30,2,10); 
			empWageBuilder.calcEmpWage();
		}
	}