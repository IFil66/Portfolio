public class Engine {


  final EngineType type;
  final double volume;
  final int power;

  public Engine(EngineType type, double volume, int power) {
    this.type = type;
    this.volume = volume;
    this.power = power;
  }

  public EngineType getEnginType() {
    return type;
  }

  public double getVolume() {
    return volume;
  }

  public int getPower() {
    return power;
  }
}
