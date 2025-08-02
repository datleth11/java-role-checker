import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your role: ");
            String role = sc.nextLine().trim().toLowerCase();


            switch (role) {
                case "admin":
                    System.out.println("You are an Admin.");
                    return;
                case "moderator":
                    System.out.println("you are a Moderator.");
                    return;
                case "guest":
                    System.out.println("You are a Guest.");
                    return;
                default:
                    System.out.println("Invalid Input, try again.");
            }


        }
    }
}