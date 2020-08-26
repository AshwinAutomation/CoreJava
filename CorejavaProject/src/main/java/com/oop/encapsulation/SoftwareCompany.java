package com.oop.encapsulation;

/**
 * @author Aswani.Mahakul
 * encapsulation test
 *
 */
public class SoftwareCompany {
	private static String companyName;
	private String employeeName;
	private String employeeID;
	private String employeeDesignation;
	private double employeeSalary;
	private char employeeGender;
	public String xyz;

	static {
		SoftwareCompany.companyName = "Ernst and Young";
	}

	/**
	 * @return get companyname
	 */
	public String getCompanyName() {
		System.out.println("print companyName : " + companyName);
		return companyName;
	}

	
	public String getEmployeeName() {
		System.out.println("print EmployeeName : " + employeeName);
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeID() {
		System.out.println("print EmployeeID : " + employeeID);
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public String getEmployeeDesignation() {
		System.out.println("print EmployeeDesignation : " + employeeDesignation);
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		System.out.println("print EmployeeDesignation : " + employeeDesignation);
		this.employeeSalary = employeeSalary;
	}

	public char getEmployeeGender() {
		System.out.println("print EmployeeGender : " + employeeGender);
		return employeeGender;
	}

	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}

}
