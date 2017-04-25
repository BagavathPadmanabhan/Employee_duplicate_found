package com.chegg.person;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Object o = new Object(){};
		System.out.println("Enter No. of Employees");
		Scanner s= new Scanner(System.in);
		int no = s.nextInt();
		Employee[] arr = new Employee[no];
		System.out.println("Enter Employee details");
		Employee e;
		for (int i = 0; i < no; i++) {
			e = new Employee(){};
			s= new Scanner(System.in);
			e.id = s.nextInt();
			s= new Scanner(System.in);
			e.name = s.nextLine();
			arr[i] = e;
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
		            System.out.println("Duplicate Entry for the Employee Id: "+ arr[i].id + " Name: " + arr[i].name);
		        }else{
//		        	System.out.println("No Duplicate Entry found");
		        } 
			}
		}
	}
}
