public class Computer {


  private final String vendor;
  private final String name;
  private CPU cpu;
  private RAM ram;
  private InformationStorage informationStorage;
  private Monitor monitor;
  private Keyboard keyboard;
  public Computer( String name,
                   String vendor,
                   CPU cpu,
                   RAM ram,
                   InformationStorage informationStorage,
                   Monitor monitor,
                   Keyboard keyboard) {
    this.name = name;
    this.vendor = vendor;
    this.cpu = cpu;
    this.ram = ram;
    this.informationStorage = informationStorage;
    this.monitor = monitor;
    this.keyboard = keyboard;
  }

  public String getVendor() {
    return vendor;
  }

  public String getName() {
    return name;
  }

  // Task 6.1
  public double totalWeightAllComputerElements() {
    return getCpuWeight() + getRamWeight() + getInformationStorageWeight() +
            getMonitorWeight() + getKeyboardWeight();
  }

  // Task 6.2
  // CPU
  public int getCpuFrequency() {
    return cpu.getFrequency();
  }

  public int getCpuNumberOfCores() {
    return cpu.getNumberOfCores();
  }

  public CpuVendor getCpuVendor() {
    return cpu.getVendor();
  }

  public double getCpuWeight() {
    return cpu.getWeight();
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  // RAM
  public RamType getRamType() {
    return ram.getType();
  }

  public int getRamVolume() {
    return ram.getVolume();
  }

  public double getRamWeight() {
    return ram.getWeight();
  }

  public void setRam(RAM ram) {
    this.ram = ram;
  }

  // Information Storage
  public InformationStorageType getInformationStorageType() {
    return informationStorage.getType();
  }

  public int getInformationStorageVolume() {
    return informationStorage.getVolume();
  }

  public double getInformationStorageWeight() {
    return informationStorage.getWeight();
  }

  public void setInformationStorage(InformationStorage informationStorage) {
    this.informationStorage = informationStorage;
  }

  // Monitor
  public double getMonitorDiagonal() {
    return monitor.getDiagonal();
  }

  public MonitorMatrixType getMonitorMatrixType() {
    return monitor.getMatrixType();
  }

  public double getMonitorWeight() {
    return monitor.getWeight();
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  // Keyboard
  public KeyboardType getKeyboardType() {
    return keyboard.getType();
  }

  public KeyboardHasIllumination getKeyboardHasIllumination() {
    return keyboard.getItHasIllumination();
  }

  public double getKeyboardWeight() {
    return keyboard.getWeight();
  }

  public void setKeyboard(Keyboard keyboard) {
    this.keyboard = keyboard;
  }

  // Task 6.3
  public static void toString (Computer computer) {

    System.out.println(
            "Название компьютера: " + computer.getName() + "\n"
            + "Производитель: " + computer.getVendor() + "\n"
            + "Состав: "  + "\n"
            + "Процессор"  + "\n"
            + "   " + "Частота: " + computer.getCpuFrequency() + " МГц" + "\n"
            + "   " + "Количество ядер: " + computer.getCpuNumberOfCores() + "\n"
            + "   " + "Производитель: " + computer.getCpuVendor() + "\n"
            + "   " + "Вес: " + computer.getCpuWeight() + " кг." + "\n"
            + "Оперативная память"  + "\n"
            + "   " + "Тип: " + computer.getRamType() + "\n"
            + "   " + "Объём: " + computer.getRamVolume() + " Гб" + "\n"
            + "   " + "Вес: " + computer.getRamWeight() + " кг." + "\n"
            + "Накопитель информации"  + "\n"
            + "   " + "Тип: " + computer.getInformationStorageType() + "\n"
            + "   " + "Объём памяти: " + computer.getInformationStorageVolume() + " Гб" + "\n"
            + "   " + "Вес: " + computer.getInformationStorageWeight() + " кг." + "\n"
            + "Монитор"  + "\n"
            + "   " + "Диагональ: " + computer.getMonitorDiagonal() + " дюйма" + "\n"
            + "   " + "Тип матрицы: " + computer.getMonitorMatrixType() + "\n"
            + "   " + "Вес: " + computer.getMonitorWeight() + " кг." + "\n"
            + "Клавиатура"  + "\n"
            + "   " + "Тип: " + computer.getKeyboardType() + "\n"
            + "   " + "Наличие подсветки: " + computer.getKeyboardHasIllumination() + "\n"
            + "   " + "Вес: " + computer.getKeyboardWeight() + " кг." + "\n"
    );
  }
}