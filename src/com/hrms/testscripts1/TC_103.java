package com.hrms.testscripts1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib1.General1;

public class TC_103 {
	@Test
	public void tc102() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General1 obj= new General1();
		obj.Application();
		obj.login();
		obj.addemp();
		obj.delmp();
		obj.logout();
		obj.closebrowser();
	}

}
