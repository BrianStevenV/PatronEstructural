import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account normalAcc = Print.print("Normal Account");
        normalAcc.entry();
        normalAcc.withdrawl();

        System.out.println("\n");

        Account QrAcc = Print.print("QR Account");
        QrAcc.entry();
        QrAcc.withdrawl();

    }
}