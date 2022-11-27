  public class InformationStorage {

    private final InformationStorageType informationStorageType;
    private final int volume;
    private final double weight;

    public InformationStorage(InformationStorageType informationStorageType, int volume, double weight) {
      this.informationStorageType = informationStorageType;
      this.volume = volume;
      this.weight = weight;
    }

    public InformationStorageType getType() {
      return informationStorageType;
    }

    public int getVolume() {
      return volume;
    }

    public double getWeight() {
      return weight;
    }
  }
