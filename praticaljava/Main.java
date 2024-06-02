package praticaljava;

class Bank {

  public double getRateOfInterest() {
    return 0.0; // Default implementation returns 0% interest
  }
}

class HDFC extends Bank {

  @Override
  public double getRateOfInterest() {
    return 4.0; // HDFC bank interest rate is 4.0%
  }
}

class SBI extends Bank {

  @Override
  public double getRateOfInterest() {
    return 4.5; // SBI bank interest rate is 4.5%
  }
}

class PNB extends Bank {

  @Override
  public double getRateOfInterest() {
    return 5.0; // PNB bank interest rate is 5.0%
  }
}

public class Main {

  public static void main(String[] args) {
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    // Upcasting HDFC object to Bank reference
    Bank hdfcBank = new HDFC();
    System.out.println(
      "HDFC Bank Interest Rate: " + hdfcBank.getRateOfInterest() + "%"
    );

    // Upcasting SBI object to Bank reference
    Bank sbiBank = new SBI();
    System.out.println(
      "SBI Bank Interest Rate: " + sbiBank.getRateOfInterest() + "%"
    );

    // Upcasting PNB object to Bank reference
    Bank pnbBank = new PNB();
    System.out.println(
      "PNB Bank Interest Rate: " + pnbBank.getRateOfInterest() + "%"
    );
  }
}
