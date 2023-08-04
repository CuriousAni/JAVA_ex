package allCode;

public class reverse {

  static int getReverse(int n) {
    int r, s = 0;

    while (n != 0) {
      r = n % 10;
      s = s * 10 + r;
      n = n / 10;
    }

    return s;
  }

  // Driver program
  public static void main(String[] args) {

    System.out.println(getReverse(45666));
  }
}