import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDigital Library Management System");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Admin login and functionalities
                    adminLogin();
                    break;
                case 2:
                    // User login and functionalities
                    userLogin();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    private static void adminLogin() {
        // Implement admin login logic (username/password)
        System.out.println("Enter Id");
        Scanner sc = new Scanner(System.in);
        int Id = sc.nextInt();
        int adminid = 1212;
        if (Id == adminid) {
            System.out.println("enter your password");
            Scanner pass = new Scanner(System.in);
            String password = pass.next();
            String correct = "cse";

            if (password == correct) {
                System.out.println(" Welcome to the admin profile ");
            }
            System.out.println("Welcome to the admin profile ");
        } 
        else {
            System.out.println("Invalid Id or password");
        }

    }

    private static void userLogin() {
        // Implement user login logic (member ID)
    }
}
