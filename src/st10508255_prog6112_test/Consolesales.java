package st10508255_prog6112_test;

public abstract class Consolesales implements IConsole {
    
    private String getConsoleType;
    private String getStore;
    private int getTotalSales;

  
    public Consolesales(String consoletype, String store, int totalsales) {

        this.ConsoleType = consoletype;
        this.Store = Name;
        this.SalesTotal = totalsales;
    }

    // Return the accident vehicle type
    @Override
    public String getConsoleName() {
        return getConsoleType;
    }

    // Return the city
    @Override
    public String getStoreName() {
        return getStore;
    }

    // Return the total number of accidents
    @Override
    public int getTotalSales() {
        return getTotalSales;
    }
}

    