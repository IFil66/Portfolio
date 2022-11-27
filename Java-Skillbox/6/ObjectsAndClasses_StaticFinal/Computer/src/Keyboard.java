public class Keyboard {


  private final KeyboardType keyboardType;
  private final KeyboardHasIllumination keyboardHasIllumination;
  private final double weight;

  public Keyboard(KeyboardType keyboardType, KeyboardHasIllumination keyboardHasIllumination, double weight) {
    this.keyboardType = keyboardType;
    this.keyboardHasIllumination = keyboardHasIllumination;
    this.weight = weight;
  }
  public KeyboardType getType() {
    return keyboardType;
  }

  public KeyboardHasIllumination getItHasIllumination() {
    return keyboardHasIllumination;
  }

  public double getWeight() {
    return weight;
  }
}
