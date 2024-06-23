
import java.util.Scanner;

	public class StudentResult {
		String name;
		float total_marks;
		int subject;
		int subject1;
		int subject2;
		int roll_no;
		float perc;
		int sum;
		int marks;

		public static void main(String[] args) {

			StudentResult stu = new StudentResult();
			stu.get_data();
			if (stu.isValidMarks()) {
				stu.final_result();
			}
		}

		public void get_data() {
			System.out.println("Enter the student data");
			System.out.println("_\n\n");
			Scanner s = new Scanner(System.in);
			System.out.println("Enyer the student roll no: ");
			roll_no = s.nextInt();
			System.out.println("Enter the student name: ");
			name = s.next();
			System.out.println("Enter first subject marks: ");
			subject = s.nextInt();
			System.out.println("Enter second subject marks: ");
			subject1 = s.nextInt();
			System.out.println("Enter third subject marks: ");
			subject2 = s.nextInt();

			sum = subject + subject1 + subject2;
		}

		public void final_result() {
			perc = sum / 3;
			System.out.println("The percentage is " + perc);
			if (perc >= 90) {
				System.out.println("Your result is A+ grade ");

			} else if (perc > 80 && perc <= 90) {
				System.out.println("Your result is A grade ");
			} else if (perc > 70 && perc <= 80) {
				System.out.println("Your result is B grade ");
			} else if (perc > 60 && perc <= 70) {
				System.out.println("Your result is grade ");
			} else if (perc > 50 && perc <= 60) {
				System.out.println("Your result is D grade ");
			} else if (perc > 35 && perc <= 50) {
				System.out.println("Your result is E grade ");
			} else {
				System.out.println("Your result is fail  ");
			}
		}

		public boolean isValidMarks() {
			boolean isCorrect = true;
			
			if (subject < 0 || subject > 100) {
				System.out.println("First Subject Marks is Incorrect. ");
				isCorrect = false;
			}

			if (subject1 < 0 || subject1 > 100) {
				System.out.println("Second Subject Marks is Incorrect. ");
				isCorrect = false;
			}

			if (subject2 < 0 || subject2 > 100) {
				System.out.println("Third Subject Marks is Incorrect ");
				isCorrect = false;
			}
			return isCorrect;
		}

	}

