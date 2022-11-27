import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int value = new Scanner(System.in).nextInt();
    for (int multiplierOne = 1; multiplierOne <= value; multiplierOne = multiplierOne + 1) {
      for (int multiplierTwo = value; multiplierTwo > 0; multiplierTwo = multiplierTwo - 1) {
        if (multiplierOne * multiplierTwo == value) {
          System.out.println(multiplierOne + "*" + multiplierTwo);
        } else {
          continue;
        }
      }
    }
    if (value <= 0) {
      System.out.println("¬ведено неверное число! „исло должно быть больше нул€.");
    }
  }
}
