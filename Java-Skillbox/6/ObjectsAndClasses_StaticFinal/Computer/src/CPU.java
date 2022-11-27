
  public class CPU {

    private final int frequency;
    private final int numberOfCores;

    private final CpuVendor cpuVendor;

    private final double weight;

    public CPU(int frequency, int numberOfCores, CpuVendor cpuVendor, double weight) {
      this.frequency = frequency;
      this.numberOfCores = numberOfCores;
      this.cpuVendor = cpuVendor;
      this.weight = weight;
    }

    public int getFrequency() {
      return frequency;
    }

    public int getNumberOfCores() {
      return numberOfCores;
    }

    public CpuVendor getVendor() {
      return cpuVendor;
    }

    public double getWeight() {
      return weight;
    }
  }
