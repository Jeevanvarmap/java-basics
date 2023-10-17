package com.training.adi;

public class Employee{
    String name;
	int empId;
	String empDept;
	double salary;
	
	public Employee() {
		System.out.println("Employee Class Default Constructor");
	}
	
	public Employee(String inputName,int inputId,String inputDept,double inputSalary) {
		this.name=inputName;
		this.empId=inputId;
		this.empDept=inputDept;
		this.salary=inputSalary;
	}
	
	public String getEmpName() {
		return this.name;
	}
	
	public void setEmpName(String inputName) {
		this.name=inputName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(int inputId) {
		this.empId=inputId;
	}
	
	public String getEmpDept() {
		return this.empDept;
	}
	
	public void setEmpDept(String inputDept) {
		this.empDept=inputDept;
	}
	
	public double getEmpSalary() {
		return this.salary;
	}
	
	public void setEmpSalary(double inputSalary) {
		this.salary=inputSalary;
	}
	
	public String toString() {
		return "Name: "+this.name+", Id: "+this.empId+", Department: "+this.empDept+", Salary: "+this.salary;
	}
	
// 	@Override
//     public int compareTo(Employee emp) {
//         return this.name - emp.name;
//     }
	
}

