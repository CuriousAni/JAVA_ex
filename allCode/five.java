package allCode;

class Main {
    static void Test(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    void Test(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String args[]) {
        byte a = 10;
        byte b = 15;
        Test(a, b);

    }
}