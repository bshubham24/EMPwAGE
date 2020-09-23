package com;

public class EmpWageBuilder {
	  public static void main(String[] args) {
		  int IS_PERMANENT_EMPLOYEE = 1;
		  int IS_TEMPORARY_EMPLOYEE = 2;
			int EMP_RATE_PER_HOUR = 20;
			int emp_Hrs=0;
			int emp_Wage=0;
			double CHECK = Math.floor(Math.random()*10)%3;
			if(CHECK== IS_PERMANENT_EMPLOYEE) {
				emp_Hrs = 8;
			}
			else if(CHECK== IS_TEMPORARY_EMPLOYEE) {
				emp_Hrs =4;
			}
			else {
				emp_Hrs = 0;
			}
			emp_Wage = emp_Hrs*EMP_RATE_PER_HOUR;
			System.out.println(emp_Wage);
			
		}
}
