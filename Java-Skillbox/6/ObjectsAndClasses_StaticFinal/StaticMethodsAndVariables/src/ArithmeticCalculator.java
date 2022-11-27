public class ArithmeticCalculator {
  int a;
  int b;

  public ArithmeticCalculator(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int calculate(Operation operation) {
    int x = 0;
    switch (operation) {
      case ADD: x = a + b;
        break;
      case SUBTRACT: x = a - b;
        break;
      case MULTIPLICATION: x = a * b;
        break;
    }
    return x;
  }
}
