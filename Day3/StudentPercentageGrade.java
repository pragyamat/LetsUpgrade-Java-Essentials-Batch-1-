/* Question-1
 * Take 5 subjects marks each subject 100 marks;
	calculate the percentage;
	based on the percentage print the grade and the percentage;
 */
import java.util.Scanner;
class StudentPercentageGrade{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 5 Subjects:\n");
        float math;
        System.out.println("Enter marks in Maths:");
        math = sc.nextFloat();

        float phys;
        System.out.println("Enter marks in Physics:");
        phys = sc.nextFloat();

        float chem;
        System.out.println("Enter marks in Chemistry");
        chem = sc.nextFloat();

        float cs;
        System.out.println("Enter marks in Computer Science");
        cs = sc.nextFloat();

        float bio;
        System.out.println("Enter marks in Biology");
        bio = sc.nextFloat();
        sc.close();
        float sum;
        sum = math+phys+chem+cs+bio;


        float percentage;
        percentage = (sum/500)*100;

        System.out.println("Your percentage is " +percentage+" %");


        if (percentage >= 90 && percentage <= 100) {
            System.out.println("You have A grade");
        }

        else if (percentage >= 70 && percentage < 90) {
            System.out.println("You have B grade");
        }

        else if (percentage >= 50 && percentage <70) {
            System.out.println("You have C grade");
        }
        
        else if (percentage >= 35 && percentage <50) {
            System.out.println("You have D grade");
        }

        else {
            System.out.println("Fail");
        }
    }
}
