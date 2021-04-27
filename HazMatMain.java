/*

  ==============================
	HazMatMain.java - OOP Team 2 
	* 
	* Patrick Carroll, Aaron Fortner, James Montis
  ==============================
  * 
  
  
*/

import java.util.Date;

public class HazMatMain {

		public static void main(String[] args){

			System.out.println("hey");
			employeeTest();
			
		}

		public static void employeeTest(){
			HM_Employee test = new HM_Employee("Capt Stubing","Isaac Washinton","9/24/1977",
					"A","12/7/1979","night","Stewards");
			System.out.println(test.toString());
		}
	
}
