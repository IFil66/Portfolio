public class Book {
  private final String name;
  private final String author;
  private final int numberOfPages;
  private final long numberISBN;


  public Book(String name, String author, int numberOfPages, long numberISBN) {
    this.name = name;
    this.author = author;
    this.numberOfPages = numberOfPages;
    this.numberISBN = numberISBN;
  }

  public String getName() {
    System.out.println("\n" + "Название книги: " + name);
    return name;
  }

  public String getAuthor() {
    System.out.println("\n" + "Автор: " + author);
    return author;
  }

  public int getNumberOfPages() {
    System.out.println("\n" + "Количество страниц: " + numberOfPages + " стр.");
    return numberOfPages;
  }

  public long getNumberISBN() {

    System.out.println("\n" + "Номер ISBN: " + numberISBN);
    return numberISBN;
  }
}

