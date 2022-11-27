public class Product {
  private final String name;
  private int price;

  private final long barCode;

  public Product(String name, long barCode) {
    this.name = name;
    this.barCode = barCode;
  }

  public String getName() {
    System.out.println("\n" + "Название: " + name);
    return name;
  }

  public int getPrice() {
    System.out.println("\n" + "Цена: " + price + " руб.");
    return price;
  }

  public long getBarCode() {
    System.out.println("\n" + "Штрих-код: " + barCode);
    return barCode;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
