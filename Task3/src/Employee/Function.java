package Employee;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import Employee.Employee.ContractEmployee;
import Employee.Employee.PartTimeEmployee;
import Employee.Employee.PermanentEmployee;





public class Function {
	
	static Logger log= Logger.getLogger(Function.class.getName()); 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		log.info("Program is started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the EmployeeType:Permanent, PartTime, Contract or you want to list to list Employee: List");
    	String EmpType=sc.nextLine();
    	 
    	 Employee e;
    	  if("Permanent".equalsIgnoreCase(EmpType)) {
		 e= new PermanentEmployee(EmpType);
		}
    	  else if("PartTime".equalsIgnoreCase(EmpType)) {
    	  e= new PartTimeEmployee(EmpType);}
    	  else if("Contract".equalsIgnoreCase(EmpType)){
  	 e= new ContractEmployee(EmpType);}
    	  else if("List".equalsIgnoreCase(EmpType)) {
    		  ListEmployee le= new ListEmployee();
    	    	 le.list();  
    	  }
    	 else {
    		  System.out.println("Please Enter the Correct EmployeeType");  
    		  log.warn("Please enter the Correct EmployeeType");
    	  }
    	

	}

	

	
	}


