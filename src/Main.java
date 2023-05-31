import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bs;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen basamak sayisini giriniz : ");
        bs = input.nextInt();
        for (int i = 1; i <= bs; i++) {
            for (int j = bs; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}