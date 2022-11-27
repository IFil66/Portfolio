public class Country {
  private String nameOfTheCountry;
  private int population;
  private int area;
  private String nameOfTheCapital;
  private boolean accessToTheSee = false;

  public Country(String nameOfTheCountry) {
    this.nameOfTheCountry = nameOfTheCountry;
  }

  public String getNameOfTheCountry() {
    System.out.println("Название страны: " + nameOfTheCountry + "\n");
    return nameOfTheCountry;
  }

  public void setNameOfTheCountry(String nameOfTheCountry) {
    this.nameOfTheCountry = nameOfTheCountry;
  }

  public int getPopulation() {
    System.out.println("Население: " + population + " человек" + "\n");
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public int getArea() {
    System.out.println("Площадь: " + area + " кв.км" + "\n");
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  public String getNameOfTheCapital() {
    System.out.println("Столица: " + nameOfTheCapital + "\n");
    return nameOfTheCapital;
  }

  public void setNameOfTheCapital(String nameOfTheCapital) {
    this.nameOfTheCapital = nameOfTheCapital;
  }

  public boolean getAccessToTheSee() {
    if (accessToTheSee = true) {
      System.out.printf("Страна имеет выход к морю" + "\n");
    } else {
      System.out.printf("Страна не имеет выхода к морю" + "\n");
    }
    return accessToTheSee;
  }

  public void setAccessToTheSee(boolean accessToTheSee) {
    this.accessToTheSee = accessToTheSee;
  }
}
