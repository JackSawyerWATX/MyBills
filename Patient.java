import java.util.*;

class Patient {

    // 2 private instance variables of the String type called name and illness
    private String name;
    private String illness;

    // 1 private instance variable of the type ArrayList<Bill> with the name bills
    // (make sure to import the ArrayList class from the java.util package)
    private ArrayList<Bill> bills = new ArrayList<>();

    // a parameterized constructor that takes two values. The first should be a
    // String
    // parameter to initialize the field name.
    // The second parameter should be an ArrayList<Bill> to initialize the field
    // bills.
    public Patient(String name, ArrayList<Bill> bills) {

        this.name = name;
    }

    // getters and setters for name and illness
    public String getName() {
        return name;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    // a method named addBill() that takes in a parameter of the Bill type and adds
    // the bill to
    // the list bills using the add() method for ArrayList objects.
    public void addBill(Bill bill) {
        bills.add(bill);
    }

    // an overridden toString() method that returns the following String:
    @Override
    public String toString() {
        return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
    }

    // a method named printBills() that prints the total value of all bills. Use the
    // following
    // as a guide to create this method:
    // *create a total variable of type double and assign it an initial value of 0.
    // *use a for-each loop to iterate over bills: for each bill, add the bill's
    // amount to the
    // total.
    // *Then, still within the for-each loop, print the bill to the console using
    // the println()
    // method
    // *print the total value after the loop ends
    public Double printBills() {
        double total = 0;

        for (Bill b : bills) {
            total = total + 1;
            System.out.println(b);
        }

        return total;

    }
}