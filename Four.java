public class StudentResult {
    public static void main(String[] args) {
        int marks = 20; 

        if (marks >= 60) {
            System.out.println("Huh! The student passed.");
            if (marks >= 90) {
                System.out.println("Rank: Distinction");
            } else if (marks >= 80) {
                System.out.println("Rank: First Class");
            } else if (marks >= 70) {
                System.out.println("Rank: Second Class");
            } else {
                System.out.println("Rank: Pass");
            }
        } else {
            System.out.println("Sorry, the student failed.");
        }
    }
}
