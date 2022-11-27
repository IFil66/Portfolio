public class Monitor {

  private final double diagonal;
  private final MonitorMatrixType monitorMatrixType;
  private final double weight;

  public Monitor(double diagonal, MonitorMatrixType monitorMatrixType, double weight) {
    this.diagonal = diagonal;
    this.monitorMatrixType = monitorMatrixType;
    this.weight = weight;
  }

  public double getDiagonal() {
    return diagonal;
  }

  public MonitorMatrixType getMatrixType() {
    return monitorMatrixType;
  }

  public double getWeight() {
    return weight;
  }
}