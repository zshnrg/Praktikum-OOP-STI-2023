import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Email email = new Email(input);

        try {
            System.out.println(email.validateEmail());
            System.out.println("Email validated.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getClass().getName() + "! " + e.getMessage());
            System.out.println("Email string error!");
        } catch (InvalidDomainException e) {
            System.out.println(e.getClass().getName() + "! " + e.getMessage());
            System.out.println("Email string error!");
        } finally {
            System.out.println("Operation finished.");
        }

        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan parameter System.in
        // ke dalam konstruktor Scanner.
        sc.close();
    }
    
}