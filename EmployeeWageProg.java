public class EmployeeWageProg
{
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
		
			private final String company;
			private final int wagePerHour;
			private final int maxDays;
			private final int maxHours;
			
	public EmployeeWageProg(String company, int wagePerHour, int maxDays,int maxHours) {
			this.company = company;
			this.wagePerHour = wagePerHour;
			this.maxDays = maxDays;
			this.maxHours = maxHours;
	}
	private int calcEmpWage() {
			
	//		Variables
	int attendance, perDayWage=0,workedHours=0,day=0;
	int totalAttendance=0,totalWorkedHours=0;
	
	//computation
	while(totalAttendance <= maxDays  && totalWorkedHours < maxHours)
		{
		day=day+1;
		System.out.print("Day "+day+",");
		attendance=(int)Math.floor(Math.random()*10)%3;
		switch(attendance)
			{
				case IS_FULL_TIME: 
					{
						System.out.println(" The Employee is present");
						workedHours=8;
						perDayWage=wagePerHour*workedHours;
						System.out.println("Employee wage is: "+ perDayWage);
						break;
					}
				case IS_PART_TIME: 
					{
						System.out.println(" The Employee is present Half a day");
						workedHours=4;
						perDayWage=wagePerHour*workedHours;
						System.out.println("Employee wage is: "+ perDayWage);
						break;
					}
				default:
					{
						System.out.println(" Employee is absent");
						workedHours=0;
						break;
					} 
			}		
				totalAttendance++;
				totalWorkedHours = totalWorkedHours + workedHours;
			System.out.println("Total attendance:"+ totalAttendance);
			System.out.println("Total worked hours: "+ totalWorkedHours);
		}
		int totalEmpWage = totalWorkedHours * wagePerHour;
		return totalEmpWage;
		}
	
		public static void main(String[] args) {
				
			EmployeeWageProg dMart = new EmployeeWageProg("DMart",20,2,10);
			EmployeeWageProg bigBasket = new EmployeeWageProg("BigBasket",20,2,10);
			
			System.out.println("Total earnings for the employee for the company : "+ dMart.company+" is: "+ dMart.calcEmpWage());
			System.out.println("Total earnings for the employee for the company : "+ bigBasket.company+" is: "+ bigBasket.calcEmpWage());
	
		}
	}