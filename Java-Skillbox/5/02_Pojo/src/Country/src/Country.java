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
    System.out.println("�������� ������: " + nameOfTheCountry + "\n");
    return nameOfTheCountry;
  }

  public void setNameOfTheCountry(String nameOfTheCountry) {
    this.nameOfTheCountry = nameOfTheCountry;
  }

  public int getPopulation() {
    System.out.println("���������: " + population + " �������" + "\n");
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public int getArea() {
    System.out.println("�������: " + area + " ��.��" + "\n");
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  public String getNameOfTheCapital() {
    System.out.println("�������: " + nameOfTheCapital + "\n");
    return nameOfTheCapital;
  }

  public void setNameOfTheCapital(String nameOfTheCapital) {
    this.nameOfTheCapital = nameOfTheCapital;
  }

  public boolean getAccessToTheSee() {
    if (accessToTheSee = true) {
      System.out.printf("������ ����� ����� � ����" + "\n");
    } else {
      System.out.printf("������ �� ����� ������ � ����" + "\n");
    }
    return accessToTheSee;
  }

  public void setAccessToTheSee(boolean accessToTheSee) {
    this.accessToTheSee = accessToTheSee;
  }
}
