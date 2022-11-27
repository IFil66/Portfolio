public class Arithmetic {
  int numberOne = 0;
  int numberTwo = 0;

  public Arithmetic(int numberOne, int numberTwo){
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
  }

  public void getSum() {
    int sum = numberOne + numberTwo;
    System.out.printf("Сумма чисел = " + sum + "\n");
  }

  public void getMultiplication() {
    int multiplication = numberOne * numberTwo;
    System.out.printf("Произведение чисел = " + multiplication + "\n");
  }

  public void getMax() {
    int Max = numberTwo;
    if (numberOne > numberTwo) {
      Max = numberOne;
    }
    System.out.printf("Максимальное из двух чисел = " + Max + "\n");
  }

  public void getMin() {
    int Min = numberTwo;
    if (numberOne < numberTwo) {
      Min = numberOne;
    }
    System.out.printf("Минимальное из двух чисел = " + Min + "\n");
  }

}