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
    System.out.println("��������: " + nameOfThePie + "\n");
    return nameOfThePie;
  }

  public void setNameOfThePie(String nameOfThePie) {
    this.nameOfThePie = nameOfThePie;
  }

  public String getFillingOfThePie() {
    System.out.println("�������: " + fillingOfThePie + "\n");
    return fillingOfThePie;
  }

  public void setFillingOfThePie(String fillingOfThePie) {
    this.fillingOfThePie = fillingOfThePie;
  }

  public boolean getButterDough() {
    if (butterDough = true) {
      System.out.printf("� ������������� ������ �������������� ������� �����" + "\n");
    } else {
      System.out.printf("� ������������� ������ �������������� ������� �����" + "\n");
    }
    return butterDough;
  }

  public void setButterDough(boolean butterDough) {
    this.butterDough = butterDough;
  }

  public double getWeight() {
    System.out.println("���: " + weight + " ��" + "\n");
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
