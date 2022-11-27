import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int value = new Scanner(System.in).nextInt();
    int factorialValue = 1;
    String total = "1";
    for (int i = 1; i <= value; i = i + 1) {
      factorialValue = factorialValue * i;
      if (i != 1) {
        total = total + " x " + i;
      }
    }
    if (value < 1) {
      System.out.println("Вы ввели неверное число. Для вычисления факториала число должно быть 1 и более");
    } else {
      System.out.println(value + "!" + " = " + total + " = " + factorialValue);
    }
  }
}
