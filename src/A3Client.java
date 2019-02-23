/********************************************************************
 * Programmer:	A. Mittal
 * Class:  CS30S
 *
 * Assignment: Assignment 3: Employee Payroll
 * Program Name:  A3Client
 *
 * Description: create a class for printing banners and closing messages
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class A3Client {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
    	
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        ProgramInfo myProgramInfo = new ProgramInfo();
        
        EmployeeClass myEmployeeClass = new EmployeeClass();

        // Employee Objects
        EmployeeClass employeeOne = new EmployeeClass();
        System.out.println("Employee One: " + employeeOne);
        
        EmployeeClass employeeTwo = new EmployeeClass();
        System.out.println("Employee Two: " + employeeTwo);
        
        EmployeeClass employeeThree = new EmployeeClass();
        System.out.println("Employee Three: " + employeeThree);
        
        EmployeeClass employeeFour = new EmployeeClass();
        System.out.println("Employee Four: " + employeeFour);
                
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        System.out.println(myProgramInfo.getBanner("A3"));
        fout.println(myProgramInfo.getBanner("A3"));
	    	
    // ************************ get input **********************

    
    // ************************ processing ***************************    
    
    
    // ************************ print output ****************************
    
    // Employee objects instantiated
    
    // Employee One
        System.out.println("---------------------------------------------------------" + nl);
        System.out.println("Employee One Id: " + employeeOne.getId());
        System.out.println("Employee One Hours: " + employeeOne.getHours());
        System.out.println("Employee One Wage: " + employeeOne.getWage());
        System.out.println("Employee One Regular Pay: " + "$" + employeeOne.getRegularPay());
        System.out.println("Employee One Overtime Pay: " + "$" + employeeOne.getOvertimePay());
        System.out.println("Employee One Gross Pay: " + "$" + employeeOne.getGrossPay());
        
        employeeOne.setHours(28);
        employeeOne.setWage(23);
        
        System.out.println(nl + "New Employee One Properties:");
        System.out.println("Employee One Hours: " + employeeOne.getHours());
        System.out.println("Employee One Wage: " + employeeOne.getWage());
        System.out.println("Employee One Regular Pay: " + "$" + employeeOne.getRegularPay());
        System.out.println("Employee One Overtime Pay: " + "$" + employeeOne.getOvertimePay());
        System.out.println("Employee One Gross Pay: " + "$" + employeeOne.getGrossPay());
        
        System.out.println(nl + nl + "Here's a summary of Employee One: ");
        System.out.println("Employee One Summary: " + employeeOne.toString());  // test this out
        
    // Employee Two
        System.out.println("---------------------------------------------------------" + nl);
        System.out.println("Employee Two Id: " + employeeTwo.getId());
        System.out.println("Employee Two Hours: " + employeeTwo.getHours());
        System.out.println("Employee Two Wage: " + employeeTwo.getWage());
        System.out.println("Employee Two Regular Pay: " + "$" + employeeTwo.getRegularPay());
        System.out.println("Employee Two Overtime Pay: " + "$" + employeeTwo.getOvertimePay());
        System.out.println("Employee Two Gross Pay: " + "$" + employeeTwo.getGrossPay());
        
        employeeTwo.setHours(40);
        employeeTwo.setWage(17);
        
        System.out.println(nl + "New Employee Two Properties:");
        System.out.println("Employee Two Hours: " + employeeTwo.getHours());
        System.out.println("Employee Two Wage: " + employeeTwo.getWage());
        System.out.println("Employee Two Regular Pay: " + "$" + employeeTwo.getRegularPay());
        System.out.println("Employee Two Overtime Pay: " + "$" + employeeTwo.getOvertimePay());
        System.out.println("Employee Two Gross Pay: " + "$" + employeeTwo.getGrossPay());
        
        System.out.println(nl + nl + "Here's a summary of Employee Two:");
        System.out.println("Employee Two Summary: " + employeeTwo.toString());
     
    // Employee Three
        System.out.println("---------------------------------------------------------" + nl);
        System.out.println("Employee Three Id: " + employeeThree.getId());
        System.out.println("Employee Three Hours: " + employeeThree.getHours());
        System.out.println("Employee Three Wage: " + employeeThree.getWage());
        System.out.println("Employee Three Regular Pay: " + "$" + employeeThree.getRegularPay());
        System.out.println("Employee Three Overtime Pay: " + "$" + employeeThree.getOvertimePay());
        System.out.println("Employee Three Gross Pay: " + "$" + employeeThree.getGrossPay());
        
        employeeThree.setHours(58);
        employeeThree.setWage(18);
        
        System.out.println(nl + "New Employee Three Properties:");
        System.out.println("Employee Three Hours: " + employeeThree.getHours());
        System.out.println("Employee Three Wage: " + employeeThree.getWage());
        System.out.println("Employee Three Regular Pay: " + "$" + employeeThree.getRegularPay());
        System.out.println("Employee Three Overtime Pay: " + "$" + employeeThree.getOvertimePay());
        System.out.println("Employee Three Gross Pay: " + "$" + employeeThree.getGrossPay());
        
        System.out.println(nl + nl + "Here's a summary of Employee Three:");
        System.out.println("Employee Three Summary: " + employeeThree.toString());
        
    // Employee Four
        System.out.println("---------------------------------------------------------" + nl);
        System.out.println("Employee Four Id: " + employeeFour.getId());
        System.out.println("Employee Four Hours: " + employeeFour.getHours());
        System.out.println("Employee Four Wage: " + employeeFour.getWage());
        System.out.println("Employee Four Regular Pay: " + "$" + employeeFour.getRegularPay());
        System.out.println("Employee Four Overtime Pay: " + "$" + employeeFour.getOvertimePay());
        System.out.println("Employee Four Gross Pay: " + "$" + employeeFour.getGrossPay());
        
        employeeFour.setHours(2);
        employeeFour.setWage(78);
        
        System.out.println(nl + "New Employee Four Properties:");
        System.out.println("Employee Four Hours: " + employeeFour.getHours());
        System.out.println("Employee Four Wage: " + employeeFour.getWage());
        System.out.println("Employee Four Regular Pay: " + "$" + employeeFour.getRegularPay());
        System.out.println("Employee Four Overtime Pay: " + "$" +  employeeFour.getOvertimePay());
        System.out.println("Employee Four Gross Pay: " + "$" + employeeFour.getGrossPay());
        
        System.out.println(nl + nl + "Here's a summary of Employee Four:");
        System.out.println("Employee Four Summary: " + employeeFour.toString());
    
    // ******** closing message *********
        
        System.out.println(myProgramInfo.getClosingMessage("end of processing"));
        fout.println(myProgramInfo.getClosingMessage("end of proecessing"));
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************


}  // end class
