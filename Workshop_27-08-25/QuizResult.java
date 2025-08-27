import java.util.*;

public class QuizResult {
    public static int calculateScore(String[] correctAnswers, String[] userAnswers) {
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public static String getGrade(int score, int total) {
        double percentage = (score * 100.0) / total;
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "D";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int u = 0; u < n; u++) {
            String[] userAnswers = new String[correctAnswers.length];
            System.out.println("Enter answers for User " + (u + 1) + ": ");
            for (int i = 0; i < correctAnswers.length; i++) {
                userAnswers[i] = sc.next();
            }
            int score = calculateScore(correctAnswers, userAnswers);
            scores[u] = score;
            System.out.println("User " + (u + 1) + " Score: " + score + "/" + correctAnswers.length);
            System.out.println("Grade: " + getGrade(score, correctAnswers.length));
        }
        System.out.println("All Scores: " + Arrays.toString(scores));
    }
}