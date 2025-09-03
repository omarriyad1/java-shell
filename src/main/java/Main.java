import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String invalidMsg=": command not found";
        //Uncomment this block to pass the first stage
         System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input+invalidMsg);
    }
}
