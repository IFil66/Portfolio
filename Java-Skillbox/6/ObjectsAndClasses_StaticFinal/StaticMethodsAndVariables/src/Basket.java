public class Basket {
  private static int count;
  private String items = "";
  private int totalPrice = 0;
  private int limit;
  private double totalWeight = 0;

  // Task 1.1
  public static int totalCostAllBaskets;
  public static int totalItemsAllBaskets;

  public static int amountBaskets;

  // Task 1.2
  private static int totalCostAllBaskets(int price) {
    totalCostAllBaskets = totalCostAllBaskets + price;
    return totalCostAllBaskets;
  }

  private static int totalItemsAllBaskets(int count) {
    totalItemsAllBaskets = totalItemsAllBaskets + count;
    return totalItemsAllBaskets;
  }

  // Task 1.3
  public static int averageCostOfAllItems(int totalCost, int totalItems) {
    return totalCost / totalItems;
  }

  // Task 1.4
  public static int averageBasketCost(int totalBasketsCost, int amountBaskets) {
    return totalBasketsCost / amountBaskets;
  }

  public Basket() {
    increaseCount(1);
    items = "������ �������:";
    this.limit = 1000000;
  }

  public Basket(int limit) {
    this();
    this.limit = limit;
  }

  public Basket(String items, int totalPrice) {
    this();
    this.items = this.items + items;
    this.totalPrice = totalPrice;
  }

  public int getCount() {
    return count;
  }

  public void increaseCount(int count) {
    Basket.count = Basket.count + count;
  }

  public void add(String name, int price) {
    add(name, price, 1);
  }

  public void add(String name, int price, int count) {
    add(name, price, count, 0);
  }

  public void add(String name, int price, int count, double weight) {
    if (contains(name)) {
      String repeatOrderItems = "";
      repeatOrderItems = repeatOrderItems + "\n\n" + name + " - " +
              count + " ��. - " + price + "���. - " + weight + "��.";
      System.out.printf(repeatOrderItems + " - ��������!\n����� ���������� ������� � ����� ������� ����������. ������ ����� ������.\n");
      repeatOrderItems = "";
      return;
    }

    if (totalPrice + count * price >= limit) {
      String totalPriceError = "";

      totalPriceError = totalPriceError + "\n\n" + name + " - " +
              count + " ��. - " + price + "���. - " + weight + "��.";
      System.out.printf(totalPriceError + " - ��������!\n������ ����� ����������. " +
              "�������� ����� ������������ ��������� ����� ������� � - " + limit + " ���.\n");
      totalPriceError = "";
      return;
    }

    items = items + "\n" + name + " - " +
            count + " ��. - " + price + "���. - " + weight + "��.";
    totalPrice = totalPrice + count * price;
    totalWeight = totalWeight + (weight * count);

    // Task 1.2
    totalCostAllBaskets(price);
    totalItemsAllBaskets(count);
  }

  public void clear() {
    items = "";
    totalPrice = 0;
    totalWeight = 0;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public double getTotalWeight() { return totalWeight; }

  public boolean contains(String name) {
    return items.contains(name);
  }

  public void print(String title) {
    System.out.println(title);
    if (items.isEmpty()) {
      System.out.println("������� �����");
    } else {
      System.out.println(items);
      System.out.printf("����� ��� ������ ����������: " + totalWeight + " ��.");
      System.out.printf("\n����� ��������� ������ ����������: " + totalPrice + " ���.");
    }
    amountBaskets = amountBaskets + 1;
  }
}
