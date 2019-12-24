import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            Integer score = Integer.parseInt(br.readLine());
            letterGrade Grade = new letterGrade();
            char grade = Grade.letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
