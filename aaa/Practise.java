package aaa;

import java.util.Scanner;

public class Practise {
    static boolean anagram(String str1, String str2) {
        boolean status = true;
        String s1 = str1;
        String s2 = str2;
        if (s1.length() == s2.length()) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean status = anagram(s1, s2);
        if (status)
            System.out.println(s1 + " and " + s2 + " are Anagram");
        else
            System.out.println(s1 + " and " + s2 + " are not Anagram");
    }

}
