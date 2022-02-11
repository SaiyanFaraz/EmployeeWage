public class CompanyEmployeeWage {
	public final String company;
	public final int wagePerHour;
	public final int maxDays;
	public final int maxHours;
	
	public CompanyEmployeeWage(String company,int wagePerHour,int maxDays,int maxHours) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxDays = maxDays;
		this.maxHours = maxHours;
	}
}
