package lab4.task1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Text t = new Text();

        try {
            File f = new File("/Users/mbugaescu/IdeaProjects/OOP_test/src/lab4/task1/one_expression.txt");
            Scanner fReader = new Scanner(f);
            while(fReader.hasNextLine()){
                t.text = fReader.nextLine();
                if (t.Check()) System.out.println("It IS a mathematical expression");
                    else System.out.println("It is NOT a mathematical expression");
            }
            fReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}