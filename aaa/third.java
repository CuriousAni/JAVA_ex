package aaa;

class Test {
    int i;

    public Test(int k) {
        i = k;
    }

    public Test(int k, int m) {
        System.out.println("Hi I am assigning the value max(k, m) to i");
        if (k > m) {
            i = k;
        } else {
            i = m;
        }
    }

}

public class third {
    public static void main(String args[]) {
        Test test1 = new Test(10);
        Test test2 = new Test(12, 15);
        System.out.println(test1.i);
        System.out.println(test2.i);
    }
}
