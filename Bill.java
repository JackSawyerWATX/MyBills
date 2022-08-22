class Bill {

    // two private instance variables, amount and date
    private double amount;
    private String date;
  
    // a parameterized constructor that initalizes amount and date using the parameter values
    public Bill(double amount, String date) {
      this.amount = amount;
      this.date = date;
    }
  
    // a getter and setter for amount
      public double getAmount() {
          return amount;
      }
      public void setAmount(double amount) {
          this.amount = amount;
    }
  
    // and an overridden toString() method
    @Override
    public String toString() {
      return "Billing date: " + this.date + ". Bill amount: " + this.amount;
    }
  }