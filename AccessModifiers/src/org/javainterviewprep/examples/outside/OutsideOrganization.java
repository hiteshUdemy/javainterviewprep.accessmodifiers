package org.javainterviewprep.examples.outside;

import org.javainterviewprep.examples.accessmodifiers.Organization;

public class OutsideOrganization {

	public static void main(String[] args) {
		
		Organization org =  new Organization();
		System.out.println(org.companyAddress);
		org.getCompanyStartDate();
	}
}
