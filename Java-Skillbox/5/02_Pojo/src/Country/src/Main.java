public class Main {
  public static void main(String[] args) {
//   Countries
    Country russia = new Country("Россия");
    russia.setPopulation(145557576);
    russia.setArea(17125191);
    russia.setNameOfTheCapital("Москва");
    russia.setAccessToTheSee(true);

    russia.getNameOfTheCountry();
    russia.getNameOfTheCapital();
    russia.getArea();
    russia.getPopulation();
    russia.getAccessToTheSee();

    Country usa = new Country("США");
    usa.setPopulation(333449281);
    usa.setArea(9519431);
    usa.setNameOfTheCapital("Вашингтон");
    usa.setAccessToTheSee(true);

    usa.getNameOfTheCountry();
    usa.getNameOfTheCapital();
    usa.getArea();
    usa.getPopulation();
    usa.getAccessToTheSee();

//   Pies
    Pie cowberryPie = new Pie("Брусничный пирог", 1.5);
    cowberryPie.setFillingOfThePie("Брусника");
    cowberryPie.setButterDough(true);

    cowberryPie.getNameOfThePie();
    cowberryPie.getFillingOfThePie();
    cowberryPie.getButterDough();
    cowberryPie.getWeight();
  }
}
