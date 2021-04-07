package com.hrms.testscripts1;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib1.General1;

public class TC_102 {
	public static void main(String args[]) throws Exception {
		DOMConfigurator.configure("log4l.xml");
		General1 n= new General1() ;
		n.Application();
		n.login();
		n.addemp();
		n.delmp();
		//n.search();
		n.logout();
		n.closebrowser();
		
	
			
		
	}	
		
	}
