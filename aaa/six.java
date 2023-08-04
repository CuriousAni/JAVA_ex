package aaa;

class GFG {

    static String change(int n) {
        String temp = n + "";
        return temp.replace('0', '5');
    }

    public static void main(String[] args) {
        int num = 10120;
        System.out.println(change(num));
    }
}
