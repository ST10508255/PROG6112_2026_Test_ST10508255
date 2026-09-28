
package st10508255_prog6112_test;

public class Print Report extends ConsoleSales {

    /*
     * Constructor that accepts the vehicle type,
     * city and accident total.
     */
    public Print Report(String storename,
                              String store,
                              int salestotal) {

        super(Consoletype, storename, salestotal);
    }

    /*
     * Method used to print the accident report.
     */
    public void printsalestotalReport() {

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("************************");

        System.out.println(
                "Console Type: " + getConsoleType());

        System.out.println(
                "Store: " + getStoreName());

        System.out.println(
                "Sales Total: " + getTotalSales());

        System.out.println("************************");
    }
}    

