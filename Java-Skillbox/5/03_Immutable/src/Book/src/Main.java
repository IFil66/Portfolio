public class Main {
  public static void main(String[] args) {
    Book myBook;
    myBook = new Book("����� � ���", "�.�. �������", 1408, 9785389071230L);
    myBook.getName();
    myBook.getAuthor();
    myBook.getNumberOfPages();
    myBook.getNumberISBN();


    Product myProduct = new Product("�����", 9785389071230L);
    myProduct.setPrice(308);
    myProduct.getName();
    myProduct.getBarCode();
    myProduct.getPrice();
  }
}
