/* Question-2
 * Take employee name,date of birth,month of birth
birth year, monthly salary;
5l - 20%;
4l - 15%;
3l- 10%;
2l -5%;
Display name,age,annual salary and the tax amount
 */
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Fill the Employee Details");
			
			System.out.println("Enter Name Of The Employee:");
			String ename=sc.next();
			
			System.out.println("Enter Date Of Birth:");
			int dob=sc.nextInt();
			
			System.out.println("Enter Month Of Birth(in no.):");
			String birth_month=sc.next();
			
			System.out.println("Enter Birth Year:");
			int birth_year=sc.nextInt();
			
			System.out.println("Enter Monthly Salary:");
			float sal=sc.nextFloat();
			
			double annualsal=sal*12;
			double tax=0;
			
			System.out.println("Name: "+ename);
			
			int age=2020-birth_year;
			
			System.out.println("Age: "+age);
			
			System.out.println("Annual salary: "+annualsal);

			if(annualsal>=500000)
			{
				tax=(20*annualsal)/100;
			}
			else if(annualsal>=400000 && annualsal<500000)
			{
				tax=(15*annualsal)/100;
			}
			else if(annualsal>=300000 && annualsal<400000)
			{
				tax=(10*annualsal)/100;	
			}
			else if(annualsal>=200000 && annualsal<300000)
			{
				tax=(5*annualsal)/100;
			}
			
			System.out.println("Tax amount: "+tax);
		}

	}


