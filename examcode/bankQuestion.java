package examcode;

class MyBank {

  public double getInterestRate() {
    return 0.0;
  }
}

class SbiBank extends MyBank {

  @Override
  public double getInterestRate() {
    return 8.3;
  }
}

class HdfcBank extends MyBank {

  @Override
  public double getInterestRate() {
    return 9.7;
  }
}

class PnbBank extends MyBank {

  @Override
  public double getInterestRate() {
    return 7.8;
  }
}

public class bankQuestion {

  public static void main(String[] args) {
    PnbBank P = new PnbBank();
    HdfcBank H = new HdfcBank();
    SbiBank S = new SbiBank();

    System.out.println("Interest Rate  of SBI : " + S.getInterestRate() + "%");
    System.out.println("Interest Rate  of PNB : " + P.getInterestRate() + "%");
    System.out.println("Interest Rate  of HDFC : " + H.getInterestRate() + "%");
  }
}
