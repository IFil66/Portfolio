package Cargo.src;

public class Cargo {
  private final Dimensions dimensionsCargo;
  private final int mass;
  private final String address;
  private final boolean turnOver;
  private final String registrationNumber;
  private final boolean fragileCargo;

  public Cargo(Dimensions dimensionsCargo, int mass, String address, boolean turnOver, String registrationNumber, boolean fragileCargo) {
    this.dimensionsCargo = dimensionsCargo;
    this.mass = mass;
    this.address = address;
    this.turnOver = turnOver;
    this.registrationNumber = registrationNumber;
    this.fragileCargo = fragileCargo;
  }

  public Dimensions getDimensionsCargo() {
    return dimensionsCargo;
  }

  public int getMass() {
    return mass;
  }

  public String getAddress() {
    return address;
  }

  public Cargo setMass(int mass) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  public Cargo setAddress(String address) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  public Cargo setRegistrationNumber(String registrationNumber) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  public Cargo setTurnOver(boolean turnOver) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  public Cargo getRegistrationNumber(String registrationNumber) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  public Cargo setFragileCargo(boolean fragileCargo) {
    return new Cargo(dimensionsCargo, mass, address, turnOver, registrationNumber, fragileCargo);
  }

  private String printTurnOver() {
    if (turnOver == true) {
      return "Да";
    } else {
      return "Нет";
    }
  }

  private String printFragileCargo() {
    if (fragileCargo == true) {
      return "Да";
    } else {
      return "Нет";
    }
  }

  public String toString() {
    return dimensionsCargo + "\nМасса: " + mass + " кг\nАдрес: " + address + "\nГруз можно переворачивать: "
            + printTurnOver() + "\nРегистрационный номер груза: " + registrationNumber + "\nГруз хрупкий: " + printFragileCargo();
  }
}

