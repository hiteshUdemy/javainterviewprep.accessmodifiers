package org.javainterviewprep.examples.accessmodifiers;

public class NeighbourOrganization {
	
	public static void main(String[] args) {
		
		Organization organization = new Organization();
		System.out.println(organization.companyAddress);
		System.out.println(organization.jointHiringPolicy);
		System.out.println(organization.sharedPrinterLocation);
		
		organization.getCompanyStartDate();
		organization.jointHiringDate();
		organization.nextFireDrillDate();
	}

}
