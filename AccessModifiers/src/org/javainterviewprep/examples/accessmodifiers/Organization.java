package org.javainterviewprep.examples.accessmodifiers;

/*
 * Q1: What are Access Modifier?
 * As the name suggests itself, Access Modifiers are the mechanisms using which we can control visibility of the members of a class.
 * Members of a class include both Variables and Methods.
 * 
 * Q2: What are the different type of Access Modifiers provided by Java?
 * Java provides 4 Access Modifiers, wiz :
 * 
 * - PUBLIC 	: When a class member is specified with Public Access, it is visible to everyone (in strict meaning to every class).
 * 
 * - PROTECTED 	: When a class member is specified with Protected Access, it is only visible to the Sub-Classes and classes in the 
 * 				  same package of the Class.
 * 
 * - PRIVATE	: When a class member is specified with Private Access, it is not visible to anyone (in strict meaning to no class). 
 * 				  Only the defining class can access it.
 * 
 * - DEFAULT	: When a class member is specified with Default Access, it is only visible to Classes which share the same package 
 * 				  as the class.
 * 				  As a developer we need not mark a member "default", as if we do not mark any of the above three modifier, 
 * 				  default is awarded to the member.
 * 
 * Q3: Why do we need Access Modifiers?
 * The concept of Access Modifiers is very similar to organization which do not want to make all its assets visible to everyone.
 * They want to control who can see what, based on the importance of the asset. 
 * 
 * The same idea applies to Class and its members also.
 * There are some members which we do not want any other class to have access to and we can control this by using Access Modifiers.
 * 
 */

public class Organization {
	
	public String companyAddress = "Suite 1, Java City, Software world";
	
	protected String jointHiringPolicy = "We only do joint hiring on Friday";
	
	private String futureProjects =  "It's a Secret";
	
	String sharedPrinterLocation = "Shared Printer is on 2nd floor";
	
	public void getCompanyStartDate()
	{
		System.out.println("Company was started on Jan1 2000");
	}
	
	protected void jointHiringDate()
	{
		System.out.println("Joint Hiring will be on Oct 1");
	}
	
	private void nextCEOName()
	{
		System.out.println("We have not decided yet");
	}
	
	void nextFireDrillDate()
	{
		System.out.println("upcoming fire drill on march30");
	}
}

