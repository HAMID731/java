import java.util.Scanner;

public class StudentGradeBuilder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many student do you have: \n");
		int students = scanner.nextInt();
		System.out.print("How many student do they offer: \n");
		int subjects = scanner.nextInt();
		System.out.print("saving >>>>>>>>>>>>>>>> ");
		System.out.print("\nsaved successfully \n");
		System.out.println();

		int[][] scores = new int[students][subjects];
		double[] totals = new double[students];
        	double[] averages = new double[students];

		for (int i = 0; i < students; i++) {
			System.out.println("Entering score for student " + (i + 1) + ":");
			for (int j = 0; j < subjects; j++) {    
				int score;
				do {
					System.out.println("Enter score for subject " + (j + 1) + ":");
					score = scanner.nextInt();
					System.out.print("saving >>>>>>>>>>>>>>>> ");
					System.out.print("\nsaved successfully \n");
					System.out.println();

				} while (score < 0 || score > 100);
				scores[i][j] = score;
				totals[i] += score;
			}
			 averages[i] = totals[i] / subjects;
		}

		System.out.println("\nCLASS SUMMARY");
		System.out.println("---------------------------------------------------------------------------------------------------------\n");
        	System.out.print("STUDENT\t");
        	for (int j = 0; j < subjects; j++) {
			System.out.print(" SUB"+(j + 1)+"\t");
		
		}
		
        	System.out.printf("TOT\tAVE\n");
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		for (int i = 0; i < students; i++) {
    			System.out.print("\nStudent" + (i + 1)+ " ");
    			for (int j = 0; j < subjects; j++) {
        			System.out.print(scores[i][j]+"\t");
    			}
    			System.out.printf("%.2f   %.2f", totals[i], averages[i]);
		}

		
	}
}