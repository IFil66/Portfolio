public class Main {

    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Milk", 40);
//        basket.print("Milk");

        Basket myBasket = new Basket();
        myBasket.add("Pen", 130, 2, 0.05);
        myBasket.add("Pen", 150, 2);
        myBasket.add("Car", 900000, 2, 900000);
        myBasket.add("Motorcycle", 150000, 2, 120);
        myBasket.add("Window", 5000, 4);
        myBasket.add("Sofa", 45000);
        myBasket.print("Корзина: ");

        Basket myBasket2 = new Basket();
        myBasket2.add("Ведро", 260, 10, 1.5);
        myBasket2.add("Швабра", 300, 10, 1);
        myBasket2.add("Тряпка половая", 65, 15, 0.3);
        myBasket2.add("Веник", 125, 10, 1);
        myBasket2.add("Совок", 150, 10,0.5);
        myBasket2.print("Корзина: ");

        // Task 6.8.1
        System.out.println("\n" + "\n" + "Общее количество заказанных вещей составляет: " + Basket.totalAmountItems + " шт.");
        System.out.println("\n" + "Общая стоимость заказанных вещей составляет: " + Basket.totalCostItems + " руб.");
        System.out.println("\n" + "Средняя цена товара в корзине составляет: " + Basket.averagePriceOfItem() + " руб.");
        System.out.println("\n" + "Средняя стоимость корзины составляет: " + Basket.countAverageBasket() + " руб.");



//        Arithmetic myArithmetic = new Arithmetic(10, 11);
//        myArithmetic.getSum();
//        myArithmetic.getMultiplication();
//        myArithmetic.getMax();
//        myArithmetic.getMin();
//
//        Printer myPrinter = new Printer();
//        myPrinter.append("Вечером холодало, и я пошёл домой, так и не порыбачив", "Без рыбалки", 1);
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
//        myPrinter.append("Несколько методов append, принимающих документы (условно — на печать). " +
//                "Возможные свойства документов: текст документа, имя документа, количество страниц. Обязательным параметром " +
//                "является только текст документа, поэтому необходимо создать три метода, принимающих один, два или три параметра. " +
//                "При добавлении документов они должны добавляться в строку String queue — аналогично тому, " +
//                "как было сделано в классе Basket.", "Наши задачи", 15);
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
//        myPrinter.append("Выполнены все указанные в заданиях требования по написанию " +
//                "кода в классах Basket, Arithmetic и Printer", "Что оценивается", 3);
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
//        myPrinter.append("узнали, что такое конструкторы и для чего они используются;", "Цели");
//        myPrinter.append("Вечер... Эх, вечер. Это такое время, когда задумываешься о многом...");
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
//        myPrinter.print();
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
//        myPrinter.append("Вечером холодало, и я пошёл домой, так и не порыбачив", "Без рыбалки", 1);
//        myPrinter.append("Выполнены все указанные в заданиях требования по написанию " +
//                "кода в классах Basket, Arithmetic и Printer", "Что оценивается", 3);
//        myPrinter.getPendingPagesCount();
//        myPrinter.getTotalPagesPrint();
    }
}


