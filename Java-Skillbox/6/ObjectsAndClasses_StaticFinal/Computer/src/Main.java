public class Main {
  public static void main(String[] args){
    CPU cpu1 = new CPU(3600, 4, CpuVendor.INTEL, 0.2);
    CPU cpu2 = new CPU(3500, 6, CpuVendor.AMD, 0.2367);
    CPU cpu3 = new CPU(2000, 16, CpuVendor.BAIKAL_ELECTRONICS, 0.3);

    // RAM
    RAM ram1 = new RAM(RamType.DDR3, 2, 0.15);
    RAM ram2 = new RAM(RamType.DDR4, 8, 0.2);
    RAM ram3 = new RAM(RamType.DDR5, 16,0.25);

    // Information storage
    InformationStorage informationStorage1 = new InformationStorage(InformationStorageType.HDD, 2000, 0.5);
    InformationStorage informationStorage2 = new InformationStorage(InformationStorageType.SSD, 500, 0.2);
    InformationStorage informationStorage3 = new InformationStorage(InformationStorageType.SSD, 1000, 0.2);

    // Monitor
    Monitor monitor1 = new Monitor(20,MonitorMatrixType.TN, 3.2);
    Monitor monitor2 = new Monitor(22,MonitorMatrixType.IPS, 3);
    Monitor monitor3 = new Monitor(25,MonitorMatrixType.VA, 2.9);

    // Keyboard
    Keyboard keyboard1 = new Keyboard(KeyboardType.MECHANICAL, KeyboardHasIllumination.NO, 1.2);
    Keyboard keyboard2 = new Keyboard(KeyboardType.SCISSOR, KeyboardHasIllumination.YES, 1.5);
    Keyboard keyboard3 = new Keyboard(KeyboardType.PLUNGER, KeyboardHasIllumination.YES, 1.3);

    // Computer
    Computer computer1 = new Computer("Домашний", "HP", cpu1, ram1, informationStorage1, monitor1, keyboard1);
    Computer computer2 = new Computer("Офисный", "AMD", cpu2, ram2, informationStorage2, monitor2, keyboard2);
    Computer computer3 = new Computer("Серверный", "Байкал", cpu3, ram3, informationStorage3, monitor3, keyboard3);

    Computer.toString(computer1);
    Computer.toString(computer2);
    Computer.toString(computer3);
  }
}
