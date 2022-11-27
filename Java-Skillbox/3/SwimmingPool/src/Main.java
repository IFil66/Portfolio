public class Main {
  public static void main(String[] args) {
    int volume = 1200;
    int fillingSpeed = 30; //30 litres per minute
    int devastationSpeed = 10; //10 litres per minute
    int volumeNow = 0;
    int time = 0;
    while (volumeNow < volume) {
      time = time + 1;
      volumeNow = volumeNow + fillingSpeed - devastationSpeed;
    }
    System.out.println("Бассейн наполнится за " + time + " мин.");
  }
}
