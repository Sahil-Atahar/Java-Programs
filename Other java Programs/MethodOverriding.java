package Problem;

public class MethodOverriding {

  class bike {
    public void bikespeed() {
      System.out.println("KTM top speed 120km");
    }
  }

  class YAMAHA extends bike {
    public void bikespeed() {
      System.out.println("top speed 80km");
    }
  }

  class honda extends bike {
    public void bikespeed() {
      System.out.println("top speed 100km");
    }
  }

  public static void main(String[] args) {

    MethodOverriding.bike MY = new MethodOverriding().new bike();
    MY.bikespeed();
  }
}
