public class Main {
  public static void main(String[] args) {
    // Task Lesson 6.3
    // Product product = new Product("Арбуз", 150);
    // Product product1 = new Product("Виноград", 100);
    // Product product2 = new Product("Сливы", 60);
    // System.out.println(Product.getCount());
    // System.out.println(Product.getAveragePrice());


    // Task Lesson 6.5-1
//    ArithmeticCalculator calculator = new ArithmeticCalculator(25,36);
//    System.out.println("Сложение: " + calculator.calculate(Operation.ADD));
//    System.out.println("Вычитание: " + calculator.calculate(Operation.SUBTRACT));
//    System.out.println("Умножение: " + calculator.calculate(Operation.MULTIPLICATION));

    // Task Lesson 6.5-2
//    Engine engine = new Engine(EngineType.DIESEL, 3.5,156);
//    Engine engine1 = new Engine(EngineType.GAS,4.0, 100);
//    Car car = new Car(engine, CarType.SUV, 2300);
//
//    System.out.println("Тип автомобиля: " + car.type + "\n" +
//                    "Масса автомобиля: " + car.weight + "\n" +
//                    "Тип двигателя: " + engine.type + "\n" +
//                    "Объём двигателя: " + engine.volume + "\n" +
//                    "Мощность двигателя: " + engine.power + "\n"
//           );

    // HomeWork 6.8
    Basket basket = new Basket();
    basket.add("Ведро", 120, 10, 10);
    basket.add("Швабра", 100,10,0.5);
    basket.add("Веник", 60, 10, 0.3);
    basket.add("Совок", 55, 10, 0.2);
    basket.print("Корзина: \n");

    Basket basket1 = new Basket();
    basket1.add("Pen", 130, 2, 0.05);
    basket1.add("Pen", 150, 2);
    basket1.add("Car", 900000, 2, 900000);
    basket1.print("\n\nКорзина: ");

    Basket basket2 = new Basket();
    basket2.add("Motorcycle", 150000, 2, 120);
    basket2.add("Window", 5000, 4);
    basket2.add("Sofa", 45000);
    basket2.print("\n\nКорзина: ");


    System.out.printf("\n\nОбщее количество товаров во всех корзинах составляет: " + Basket.totalItemsAllBaskets + " шт.");
    System.out.printf("\nОбщая стоимость заказов во всех корзинах составляет: " + Basket.totalCostAllBaskets + " руб.");
    System.out.printf("\nСредняя стоимость товара во всех корзинах составляет: "
            + Basket.averageCostOfAllItems(Basket.totalCostAllBaskets, Basket.totalItemsAllBaskets) + " руб.");
    System.out.printf("\nСредняя стоимость корзины составляет: "
            + Basket.averageBasketCost(Basket.totalCostAllBaskets, Basket.amountBaskets) + " руб.");
  }
}
