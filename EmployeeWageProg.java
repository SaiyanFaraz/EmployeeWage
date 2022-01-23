public class EmployeeWageProg 
{
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			public static final int WAGE_PER_HOUR=20;
			public static final int MAX_WORKING_DAYS=20;
			public static final int MAX_WORKING_HOURS=100;
			
	public static void main(String[] args)
	{
		int attendance, perDayWage=0,workedHours=0,day=0;
		int totalAttendance=0,totalWorkedHours=0;
		System.out.println("Welcome to Employee Wage Computation");
		while(totalAttendance<=MAX_WORKING_DAYS && totalWorkedHours<=MAX_WORKING_HOURS)
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
							perDayWage=WAGE_PER_HOUR*workedHours;
							System.out.println("Employee wage is: "+ perDayWage);
							break;
						}
					case IS_PART_TIME: 
						{
							System.out.println(" The Employee is present Half a day");
							workedHours=4;
							perDayWage=WAGE_PER_HOUR*workedHours;
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
				if(workedHours==8 || workedHours==4)
				{
				totalAttendance++;
				System.out.println("Total attendance:"+ totalAttendance);
				}
				totalWorkedHours=totalWorkedHours+workedHours;
				System.out.println("Total worked hours: "+ totalWorkedHours);
			}
		int totalEmpWage= totalWorkedHours*WAGE_PER_HOUR;
		System.out.println("Total earnings for the employee: "+ totalEmpWage);
	}
}