package allCode;

public class allSum {

    static int getSum(int n) {
        int r, sum = 0;

        while (n != 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        return sum;
    }

    // Driver program
    public static void main(String[] args) {

        System.out.println(getSum(45666));
    }
}