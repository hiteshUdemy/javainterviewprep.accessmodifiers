package org.javainterviewprep.examples.outside;

import org.javainterviewprep.examples.accessmodifiers.Organization;

public class SubOrganization extends Organization {
	
	public static void main(String[] args) {
		SubOrganization subOrg = new SubOrganization();
		System.out.println(subOrg.companyAddress);
		System.out.println(subOrg.jointHiringPolicy);
		
		subOrg.getCompanyStartDate();
		subOrg.jointHiringDate();
	}

}
