package com;

public class EmpWageBuilder {
	  public static void main(String[] args) {
			int IS_PERMANENT_EMPLOYEE = 1;
			
			double CHECK = Math.floor(Math.random()*10)%2;
			if(CHECK== IS_PERMANENT_EMPLOYEE) {
				System.out.println("permanent employee");
			}
			else {
				System.out.println("NOT A PERMAMENT EMPLOYEE");
			}
		
			
		}
}
