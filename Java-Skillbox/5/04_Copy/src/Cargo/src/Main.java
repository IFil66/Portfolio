package Cargo.src;

public class Main {
  public static void main(String[] args) {
    Dimensions dimensionsCargo = new Dimensions(207, 145, 200);
    dimensionsCargo.setHeight(1000500);
    Cargo myCargo = new Cargo(dimensionsCargo, 155, "����� ������������",
            true, "A-12345", false);
    myCargo.setAddress("����� ������");
    System.out.println(myCargo);
  }
}
