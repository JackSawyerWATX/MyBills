import java.util.*;

class Main {

    public static void main(String[] args) {

        // create an ArrayList of the Bill type and save it into a variable
        ArrayList<Bill> bills = new ArrayList<>();

        // create a new patient with the name John and the ArrayList you just created
        Patient john = new Patient("John", bills);

        // set John's illness to severe cold and print the patient to the console
        john.setIllness("severe cold");
        System.out.println(john.toString());

        // create a new Bill object for John with the amount 99.95 and the date June 15
        // 2021
        Bill bill1 = new Bill(99.95, "June 15 2021");

        // add the bill to John's list of bills using the appropriate method
        john.addBill(bill1);

        // print all of John's bills using the appropriate method
        john.printBills();
        System.out.println(99.95);

    }
}