package examcode;

class clock {

  private int hours;
  private int min;
  private int sec;

  public void accept(int h, int m, int s) {
    hours = h;
    min = m;
    sec = s;
  }

  public int convert() {
    int totalsec = hours * 60 * 60 + min * 60 + sec;

    return totalsec;
  }

  public void showResult() {
    System.out.println("Total Time in Sec.  :  " + convert());
  }
}

public class clockdemo {

  public static void main(String[] args) {
    clock obj = new clock();

    obj.accept(5, 10, 40);

    obj.showResult();
  }
}
