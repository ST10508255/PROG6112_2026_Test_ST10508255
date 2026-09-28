package st10508255_prog6112_test;
import java.util.Scanner;

public class ST10508255_PROG6112_Test {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // =====================================================
        // QUESTION 1
        // =====================================================
        
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
        
        int[][] numberofsales = new int[cities.length][4];
        
         for (int i = 0; i < cities.length; i++) {

            System.out.print("Enter the number of PS5 sales for "
                    + cities[i] + ": ");
            numberofsales[i][0] = input.nextInt();

            System.out.print("Enter the number of XBOX sales for "
                    + cities[i] + ": ");
            numberofsales[i][1] = input.nextInt();
            
            System.out.print("Enter the number of SWITCH sales for "
                    + cities[i] + ": ");
            numberofsales[i][2] = input.nextInt();
        }
         
         
        // =====================================================
        // DISPLAY GAMING CONSOLE REPORT
        // =====================================================
        
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------------");
        
        System.out.printf("%-20s %-15s %-15s %-15s%n",
                "", "PS5", "XBOX", "SWITCH");
        
        // Display all number of sales information
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %-15d %-15d %-15d%n",
                    cities[i],
                    numberofsales[i][0],
                    numberofsales[i][1],
                    numberofsales[i][2]);
        }
        
        
        // =====================================================
        // CALCULATE TOTALS
        // =====================================================

        int[] salesTotals = new int[cities.length];
        
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            
            salesTotals[i] = numberofsales[i][0] + numberofsales[i][1] + numberofsales[i][2];

            System.out.printf("%-20s %d%n", cities[i], salesTotals[i]);
        }
        
        
        // =====================================================
        // CITY WITH MOST SALES
        // =====================================================
        
        int highestSalesIndex = 0;

        for (int i = 1; i < salesTotals.length; i++) {

            if (salesTotals[i] > salesTotals[highestSalesIndex]) {
                highestSalesIndex = i;
            }
        }
        
        System.out.println();

        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY: "
                + cities[highestSalesIndex]);

        System.out.println("----------------------------------------------------------------------");
    }  
}
