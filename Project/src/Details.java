import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Details {
    
    // Method to validate password
    public static boolean validatePassword(String inputPassword) {
        try {
            // Reading the password from a file
            File file = new File("C:\\Users\\ELCOT\\Music\\Project\\src\\password.txt");
            Scanner fileScanner = new Scanner(file);
            String correctPassword = fileScanner.nextLine();
            fileScanner.close();

            return inputPassword.equals(correctPassword);
        } catch (FileNotFoundException e) {
            System.out.println("Password file not found.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean isAuthenticated = false;

        // Loop for password attempts
        while (attempts > 0) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (validatePassword(password)) {
                isAuthenticated = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect password. You have " + attempts + " attempts left.");
            }
        }

        if (isAuthenticated) {
            // Creating Student and Teacher objects
            Student student = new Student("Anand", 22, "S123456");
            Teacher teacher = new Teacher("Devi", "Mathematics", 10);

            // Displaying the details
            System.out.println("Authentication successful!");
            System.out.println(student.toString());
            System.out.println(teacher.toString());
        } else {
            System.out.println("Authentication failed. Exiting program.");
        }

        scanner.close();
    }
}
