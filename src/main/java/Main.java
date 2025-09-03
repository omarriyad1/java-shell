import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String invalidMsg=": command not found";
        boolean looper=true;
        //Uncomment this block to pass the first stage
        while (looper) {
            System.out.print("$ ");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(input+invalidMsg);
        }

    }
}
