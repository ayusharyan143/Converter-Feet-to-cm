package praticaljava;

public class BankingSystem {

  private String name;
  private int accountNo;
  private double amount;

  // Method to initialize state
  public void insert(String name, int accountNo, double amount) {
    this.name = name;
    this.accountNo = accountNo;
    this.amount = amount;
  }

  // Method to deposit amount
  public void deposit(double depositAmount) {
    amount += depositAmount;
    System.out.println("Deposited: " + depositAmount);
  }

  // Method to withdraw amount
  public void withdraw(double withdrawAmount) {
    if (withdrawAmount > amount) {
      System.out.println("Insufficient balance");
    } else {
      amount -= withdrawAmount;
      System.out.println("Withdrawn: " + withdrawAmount);
    }
  }

  // Method to check balance
  public void checkBalance() {
    System.out.println("Balance: " + amount);
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Account Number: " + accountNo);
    System.out.println("Balance: " + amount);
  }

  public static void main(String[] args) {
    BankingSystem account = new BankingSystem();
    System.out.println(
      "\n\nName : Ayush Aryan \nCourse : B.TECH CSE\nRoll No. : 22\nSection : G2 \nSemester : 4th\n\n\nOUTPUT : \n"
    );

    // Initialize state
    account.insert("Ayush Aryan", 123456789, 1000);

    // Display initial state
    System.out.println("Initial State:");
    account.display();
    System.out.println();

    // Deposit amount
    account.deposit(500);
    account.checkBalance();
    System.out.println();

    // Withdraw amount
    account.withdraw(200);
    account.checkBalance();
    System.out.println();

    // Display final state
    System.out.println("Final State:");
    account.display();
  }
}
