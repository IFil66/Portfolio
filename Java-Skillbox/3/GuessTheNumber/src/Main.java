import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int value = new Random().nextInt(100);
    while (true) {
      int attempt = new Scanner(System.in).nextInt();
      if (value < attempt) {
        System.out.println("���������� ����� ������");
      } else if (value > attempt) {
        System.out.println("���������� ����� ������");
      } else {
        System.out.println("�� �������!");
        break;
      }
    }
  }
}
