import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QuestionBDriver {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File myFile = new File("numbers.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.hasNextInt());
                printBinary(sc.nextInt());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    public static int printBinary(int n) {
        System.out.println(n % 2);
        if (n <= 0) {
            return n;
        } else {
            int result = n / 2;
            return result * printBinary(n - 1);
        }
    }
}
