/********************************************************************
 * Programmer:	Amy Mittal
 * Class:       CS30S-002
 *
 * Assignment:      Assignment 3: Employee Payroll
 * Program Name:    EmployeeClass
 *
 * Description:     Class to calculate the employee's pay given 
 *                  their hourly wage and the number of hours that 
 *                  they have worked in a week
 ***********************************************************************/

// import libraries as needed

public class EmployeeClass {
    // **** class variables ****
    
        private static int employeeID = 1000;     // unique employee ID of the employees created
    
    // **** instance variables ****
        
        private int id = 0;
        private int hours = 0;
        private int wage = 0;
        private final int StandardHoursOfWork = 40;
        private final double OvertimeWageRate = 1.5;
    
    // **** constructors ****                       // assigns values to properties
     /*********************************************
     * Description: create a new employee object with undefined properties
     * 
     ***********************************************/
    public EmployeeClass(){
        id = employeeID++;      // assign id and increment next id
        hours = 0;
        wage = 0;
    } // end default constrcutor
    
    /*********************************************
     * Description: create a new employee object with defined hours and wage
     * 
     ***********************************************/
    public EmployeeClass(int h, int w){
        id = employeeID++;      // assign id and increment next id
        hours = h;
        wage = w;
    } // end initialized constrcutor
    
    // **** getters ****   
    /*********************************************
     * Description: return unique id of employee
     * 
     * Interface:
     * 
     * @return  returns employee id number
     ***********************************************/
    public int getId(){
        return id;
    } // end getId
    
    public int getHours(){
        return hours;
    } // end getHours
    
    public int getWage(){
        return wage;
    } // end getWage
    
    public double getRegularPay(){                  // method for calculating regular pay
        double regularPay = 0.0;
        if (hours == StandardHoursOfWork){
            regularPay = StandardHoursOfWork * wage;
        } // end if
        else {
            regularPay = hours * wage;
        } // end else
        return regularPay;
    } // end getRegularPay
    
    public double getOvertimePay(){                 // method for calculating overtime pay
        double overtimePay = 0.0;
        if (hours > StandardHoursOfWork){
            overtimePay = ((hours - StandardHoursOfWork) * wage * OvertimeWageRate); 
        } // end if
        else {
            overtimePay = 0.0;
        } // end else
        return overtimePay;
    } // end getOvertimePay
    
    public double getGrossPay(){          // method for calculating gross pay
        double grossPay = 0.0;
        grossPay = getRegularPay() + getOvertimePay();
        return grossPay;
    } // end getGrossPay
    
    @Override
    public String toString(){
        String summary = "";
        
        summary = this.getId() + "\n";
        summary += this.getHours() + "\n";
        summary += this.getWage() + "\n";
        summary += this.getRegularPay() + "\n";
        summary += this.getOvertimePay() + "\n";
        summary += this.getGrossPay() + "\n";
        
        return summary;
    } // end toString
    
    // **** setters ****        // new values set to properties
     /*********************************************
     * Description: set new hours the employee has worked for
     * 
     * Interface:
     * 
     * @param   h new hours the employee has worked for
     ***********************************************/
    public void setHours(int h){
        hours = h;
    } // end setHours
    
    /*********************************************
     * Description: set new wage for the employees
     * 
     * Interface:
     * 
     * @param   w new wage for the employees
     ***********************************************/
    public void setWage(int w){
        wage = w;
    } // end setWage
   
    
} // end public class
