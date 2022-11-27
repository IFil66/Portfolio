public class Product {
  private final String name;
  private int price;

  private final long barCode;

  public Product(String name, long barCode) {
    this.name = name;
    this.barCode = barCode;
  }

  public String getName() {
    System.out.println("\n" + "��������: " + name);
    return name;
  }

  public int getPrice() {
    System.out.println("\n" + "����: " + price + " ���.");
    return price;
  }

  public long getBarCode() {
    System.out.println("\n" + "�����-���: " + barCode);
    return barCode;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
