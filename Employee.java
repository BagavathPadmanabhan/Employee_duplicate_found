package com.chegg.person;

public class Employee extends Person {
	//For accessing from EmployeeApp, we declared the name variable as Protected
	protected String name;
	public Employee() {
		this.name = "";
		this.id = 0;
	}
	public Employee(int id, String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!Employee.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final Employee other = (Employee) obj;
	    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
	        return false;
	    }
	    if (this.id != other.id) {
	        return false;
	    }
	    return true;
	}
}
