public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    // Task 6.8.1
    public static int totalCostItems = 0;
    public static int totalAmountItems = 0;
    private static int numberOfBasket = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
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

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
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
            repeatOrderItems = repeatOrderItems + "\n" + name + " - " +
                    count + " шт. - " + price + "руб. - " + weight + "кг.";
            System.out.printf(repeatOrderItems + " - Внимание!\nЗаказ одноимённых товаров в одной покупке невозможен. Данный заказ отменён.\n");
            repeatOrderItems = "";
            return;
        }

        if (totalPrice + count * price >= limit) {
            String totalPriceError = "";

            totalPriceError = totalPriceError + "\n" + name + " - " +
                    count + " шт. - " + price + "руб. - " + weight + "кг.";
            System.out.printf(totalPriceError + " - Внимание!\nДанный заказ невозможен. " +
                    "Превышен лимит максимальной стоимости одной покупки в - " + limit + " руб.\n");
            totalPriceError = "";
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + "руб. - " + weight + "кг.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + (weight * count);

        // Task 6.8.1
        countTotalAmountItems(count);
        countTotalCostItems(totalPrice);
        numberOfBasket = numberOfBasket + 1;
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
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.printf("Общий вес заказа составляет: " + totalWeight + " кг.");
            System.out.printf("\nОбщая стоимость заказа составляет: " + totalPrice + " руб.");
        }
    }

    // Task 6.8.1
    private static void countTotalAmountItems(int count) {
       totalAmountItems = totalAmountItems + count;
    }
    private static void countTotalCostItems(int totalPrice) {
        totalCostItems = totalCostItems + totalPrice;
    }
    public static int averagePriceOfItem() {
        return Basket.totalCostItems / Basket.totalAmountItems;
    }
    public static int countAverageBasket() {
        return (Basket.numberOfBasket != 0 ? Basket.totalCostItems / Basket.numberOfBasket : 0);
    }
}
