public class Pie {
  private String nameOfThePie;
  private String fillingOfThePie;
  private boolean butterDough = false;
  private double weight;

  public Pie(String nameOfThePie, double weight) {
    this.nameOfThePie = nameOfThePie;
    this.weight = weight;
  }

  public String getNameOfThePie() {
    System.out.println("Название: " + nameOfThePie + "\n");
    return nameOfThePie;
  }

  public void setNameOfThePie(String nameOfThePie) {
    this.nameOfThePie = nameOfThePie;
  }

  public String getFillingOfThePie() {
    System.out.println("Начинка: " + fillingOfThePie + "\n");
    return fillingOfThePie;
  }

  public void setFillingOfThePie(String fillingOfThePie) {
    this.fillingOfThePie = fillingOfThePie;
  }

  public boolean getButterDough() {
    if (butterDough = true) {
      System.out.printf("В приготовлении пирога использовалось сдобное тесто" + "\n");
    } else {
      System.out.printf("В приготовлении пирога использовалось обычное тесто" + "\n");
    }
    return butterDough;
  }

  public void setButterDough(boolean butterDough) {
    this.butterDough = butterDough;
  }

  public double getWeight() {
    System.out.println("Вес: " + weight + " кг" + "\n");
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
