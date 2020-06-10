package com.hrms.testbase;

import com.hrms.pages.AddEmployePageObjects;
import com.hrms.pages.EmpPersonnaldetails;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.HrmDashBaordElements;
import com.hrms.pages.LoginPageObjects;
import com.hrms.pages.PersonalDetailspage;

//import pageObjectModel.SouceDemologinElements;

public class PageInitilizer extends BaseClass {
	public static AddEmployePageObjects addEmp;
	public static LoginPageObjects login;
	public static HrmDashBaordElements dash;
	public static EmpPersonnaldetails EmpPd;
	public static PersonalDetailspage pdetails;

	public static EmployeeListPage empList;

	public static void initialize() {

		addEmp = new AddEmployePageObjects();
		login = new LoginPageObjects();
		dash = new HrmDashBaordElements();
		EmpPd = new EmpPersonnaldetails();
		empList = new EmployeeListPage();
		pdetails = new PersonalDetailspage();

	}

}
