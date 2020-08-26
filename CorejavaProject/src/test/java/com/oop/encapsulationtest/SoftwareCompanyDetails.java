package com.oop.encapsulationtest;

//import org.testng.annotations.Test;

import com.oop.encapsulation.SoftwareCompany;

public class SoftwareCompanyDetails {
	SoftwareCompany softwareCompany = null;

	//@Test
	public void employeeDetails() {
		softwareCompany = new SoftwareCompany();
		softwareCompany.setEmployeeName("Ashwin Mahakul");
		softwareCompany.setEmployeeID("IN010M67931");
		softwareCompany.setEmployeeDesignation("Security Analyst");
		softwareCompany.setEmployeeGender('M');
		softwareCompany.setEmployeeSalary(45000.350);

		softwareCompany.getCompanyName();
		softwareCompany.getEmployeeName();
		softwareCompany.getEmployeeID();
		softwareCompany.getEmployeeDesignation();
		softwareCompany.getEmployeeGender();
		softwareCompany.getEmployeeSalary();

	}
}
