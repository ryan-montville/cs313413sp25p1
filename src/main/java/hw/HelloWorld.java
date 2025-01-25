package hw;
import java.time.*;

public class HelloWorld {

  public String getMessage() {
    return "hello world";
  }

  public int getYear() {
    Year thisYear = Year.now();
    return thisYear.getValue();
  }
}
