
package st10508255_prog6112_test;
import java.util.Scanner;

public class RunApplication {
     public static void run(){
    
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("QUESTION 2");
        System.out.println("----------------------------");

        System.out.print("Select the Console type: ");
        String Consoletype = input.nextLine();

        System.out.print("Enter the store: ");
        String store = input.nextLine();

        System.out.print("Enter the total " + Store + " sales for " + PS5 consoles for number 1 + ": ");

        int salesTotal = input.nextInt();

        ConsoleSalesReport report = new ConsoleSalesReport(Consoletype, store, salesTotal);

        report.printConsoleSalesReport();
     }
}

