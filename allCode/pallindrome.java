package allCode;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter Number ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int org = n;

        int r, s = 0;

        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;

        }
        System.out.println(s);

        if (org == s) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("NOT Pallindrome");

        }

    }

}
