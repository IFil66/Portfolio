public class Elevator {
  private int currentFloor = 1;
  private int minFloor;
  private int maxFloor;

  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  private int getCurrentFloor() {
    return currentFloor;
  }

  private void moveDown() {
    currentFloor = (currentFloor > minFloor ? --currentFloor : currentFloor);
  }

  private void moveUP() {
    currentFloor = (currentFloor < maxFloor ? ++currentFloor : currentFloor);
  }

  public void move(int floor) {
    if (minFloor <= floor && floor <= maxFloor) {
      while (currentFloor != floor) {
        if (currentFloor > floor) {
          moveDown();
          System.out.println(currentFloor + " ����.");
        } else {
          moveUP();
          System.out.println(currentFloor + " ����.");
        }
      }
      System.out.printf("�� �� ��������� �����.\n");
      return;
    }
    System.out.printf("������! ����� �������� ����� �����.\n");
  }
}

