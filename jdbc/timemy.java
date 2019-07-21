import java.time.*;
import java.time.LocalDate;
class timemy{
  public static void main(String[] args) {
    LocalTime t = LocalTime.now();
    System.out.println(t);
    LocalDate data = LocalDate.now();
    LocalDate d = data.plusDays(1);
    System.out.println(d);
  }
}
