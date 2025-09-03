import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String invalidMsg = ": command not found";
        String realCommand = " is a shell builtin";
        String pathEnv = System.getenv("PATH");
        String pathSeparator = System.getProperty("path.separator");
        String[] directories = pathEnv.split(java.util.regex.Pattern.quote(pathSeparator));
        for (String dir : directories) {
            System.out.println("DEBUG: Checking directory: " + dir);
        }
        List<String> commands = new ArrayList<String>();
        commands.add("exit");
        commands.add("echo");
        commands.add("type");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.print("0");
                break;
            }

            if (input.startsWith("echo ")) {
                System.out.println(input.substring(5));
                continue;
            }

            if (input.startsWith("type ")) {
                String command = input.substring(5);
                if (commands.contains(command)) {
                    System.out.println(command + realCommand);
                } else {
                    boolean found = false;
                    for (String dir : directories) {
                        File file = new File(dir, command);
                        if (file.exists() && file.canExecute()) {
                            System.out.println(command + " is " + file.getAbsolutePath());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {

                        System.out.println(command + ": not found");
                    }
                }
                continue;
            }

            System.out.println(input + invalidMsg);
        }
    }
}
