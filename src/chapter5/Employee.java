package chapter5;

public class Employee {
    
    // Data members.
    private final static double HOURLY_WAGE = 10; 
    private String employeeName;
    private static double hoursWorked;
    private static double totalSales;
    
    public Employee(String empName) {
        employeeName = empName;
        hoursWorked = 0;
        totalSales = 0;
    }
    
    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }
    
    public void setTotalSales(double sales) {
        totalSales = sales;
    }
    
    public static double getHoursWorked() {
        return hoursWorked;
    }
    
    public static double getTotalSales() {
        return totalSales;
    }
    
    public double getEmployeeWage() {
        double wage = hoursWorked * HOURLY_WAGE;
        if(hoursWorked > 40) {
            wage += (hoursWorked * (HOURLY_WAGE * 1.5)) - (40 * (HOURLY_WAGE * 1.5));
            if(totalSales > 1 && totalSales < 99.99) {
                wage+= .05*getTotalSales();
            } else {
                if(totalSales > 100 && totalSales < 299.99) {
                    wage += .10 * totalSales;
                } else {
                    if(totalSales >= 300) {
                        wage += .15 * totalSales;
                    }
                }
            }
        }
        return wage;
    }
   
}
