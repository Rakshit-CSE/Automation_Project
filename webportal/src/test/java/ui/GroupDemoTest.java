package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;
@Test(groups="User-reg")
public class GroupDemoTest extends CommonDataSetup{
	
	@Test(groups="regression")
	public void aTest1() 
	{
		System.out.println("Login Successful");
	}
	@Test(groups="bvt")
	public void aTest2()
	{
		System.out.println("Logout Successful");
	}
	@Test(groups={"regression","bvt"})
	public void aTest3()
	{
		System.out.println("Logout Successful");
	}
	@Test(groups="bvt")
	public void aTest4()
	{
		System.out.println("Logout Successful");
	}
}
