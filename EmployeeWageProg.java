public class EmployeeWageProg 
{
			public static final int IS_FULL_TIME = 1;
			
	public static void main(String[] args)
	{
		int attendance;
		System.out.println("Welcome to Employee Wage Computation");
		attendance=(int)Math.floor(Math.random()*10)%2;
		if(attendance==IS_FULL_TIME) 
		{
			System.out.println("The Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}	 
} 