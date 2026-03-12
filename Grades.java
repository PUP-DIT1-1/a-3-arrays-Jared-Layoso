import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        int[] grades = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter grade: ");
            grades[i] = sc.nextInt();

            sum += grades[i];
        }

        double average = sum / 10.0;
        System.out.println("Average grade: " + average);

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (grades[i] > grades[j]) {

                    int tempGrade = grades[i];
                    grades[i] = grades[j];
                    grades[j] = tempGrade;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\nSorted Grades (Ascending):");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
    }
}