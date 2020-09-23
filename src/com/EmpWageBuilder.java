package com;

public class EmpWageBuilder {
	  public static void main(String[] args) {
		final  int IS_PERMANENT_EMPLOYEE = 1;
		final  int IS_TEMPORARY_EMPLOYEE = 2;
		
			int EMP_RATE_PER_HOUR = 20;
			int NO_OF_DAYS = 2;
			int total_wage=0;
			int emp_Hrs=0;
			int emp_Wage=0;
			for(int i=0; i<NO_OF_DAYS;i++) {
			int CHECK = (int) Math.floor(Math.random()*10)%3;
			switch(CHECK) {
			case IS_PERMANENT_EMPLOYEE :
				emp_Hrs = 8;
			    break;
			
			    case IS_TEMPORARY_EMPLOYEE :
				emp_Hrs =4;
			    break;
			
			   default:
				emp_Hrs = 0;
			}
			emp_Wage = emp_Hrs*EMP_RATE_PER_HOUR;
			total_wage+=emp_Wage;
			}
			System.out.println(total_wage);
			
		
	  }
}
