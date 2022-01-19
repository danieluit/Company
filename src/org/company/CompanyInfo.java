package org.company;

public class CompanyInfo {
public void companyName(String name) {
System.out.println("string method"+name);

}
public void companyName(String name,long phoneNo,String city) {
System.out.println("count method"+name+"\n"+phoneNo);
System.out.println(city);
}
public void companyName(float regNo) {
	System.out.println("float method"+regNo);

}
public void companyName(String empId,int empName) {
	System.out.println("order method "+empId+"\t"+empName);

}
public void companyName(int empName,String empId) {
	System.out.println("order method"+empName+"\t"+empId);

}
public void sain() {
System.out.println("sain");
}
public void sundar() {
System.out.println();
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("Java");
	c.companyName(5642.4785f);
	c.companyName(24, "bala");
	c.companyName("Rahul", 25);
	c.companyName("Java", 9400345225l,"chennai");

	
	
	
	
}




























}
