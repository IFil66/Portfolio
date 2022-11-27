public class Printer {
  String queue = "";
  int pendingPagesCount = 0;
  int totalPagesPrint = 0;

  public void append(String textDocument) {
    append(textDocument, "");
  }

  public void append(String textDocument, String nameDocument) {
    append(textDocument, nameDocument, 1);
  }

  public void append(String textDocument, String nameDocument, int numberOfPages) {
    queue = queue + "\n" + "Название текста: " + nameDocument + "\n" + "Количество страниц: " + numberOfPages +
            "\n" + "Текст документа:" + textDocument +"\n";
    System.out.printf("Документ добавлен в очередь печати\n");
    pendingPagesCount = pendingPagesCount + numberOfPages;
  }

  public void clear() {
    queue = "";
    pendingPagesCount = 0;
  }

  public void print() {
    System.out.println("Печать начата\n" + queue + "\nПечать окончена");
    totalPagesPrint = totalPagesPrint + pendingPagesCount;
    clear();
  }

  public int getPendingPagesCount() {
    System.out.printf("Количество подлежащих печати страниц: " + pendingPagesCount + "\n");
    return pendingPagesCount;
  }

  public int getTotalPagesPrint() {
    System.out.printf("Количество напечатанных страниц: " + totalPagesPrint + "\n");
    return totalPagesPrint;
  }
}
