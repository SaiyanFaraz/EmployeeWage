public class EmployeeWageProg 
{
			public static final int IS_FULL_TIME = 1;
			public static final int WAGE_PER_HOUR=20;
			
	public static void main(String[] args)
	{
		int attendance, perDayWage=0,workedHours=0;
		System.out.println("Welcome to Employee Wage Computation");
		attendance=(int)Math.floor(Math.random()*10)%2;
		if(attendance==IS_FULL_TIME) 
		{
			System.out.println("The Employee is present");
			workedHours=8;
			perDayWage=WAGE_PER_HOUR*workedHours;
			System.out.println("Employee wage is: "+ perDayWage);
		}
		else
		{
			System.out.println("Employee is absent");
			workedHours=0;
		}
	}	 
} 