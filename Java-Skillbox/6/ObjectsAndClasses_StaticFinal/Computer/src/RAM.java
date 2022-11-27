public class RAM {


    private final RamType ramType;
    private final int volume;
    private final double weight;

    public RAM(RamType ramType, int volume, double weight) {
      this.ramType = ramType;
      this.volume = volume;
      this.weight = weight;
    }

    public RamType getType() {
      return ramType;
    }

    public int getVolume() {
      return volume;
    }

    public double getWeight() {
      return weight;
    }
}