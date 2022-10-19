package Piit.training.session.AmazonTestNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.Home;
import Amazon.Results;
import Coomon.Commons;

public class AmazonToPurchase extends Commons {
  @Test
  public void f() throws InterruptedException {
	  Home home=new Home(driver);
	  home.searchfieldsend("Computer");
	  home.searchbuttonclicking();
	  Thread.sleep(6000);
	  Results results=new Results(driver);
	 int elements= results.ResutsToVerify();
	 System.out.println(elements);
	 if(elements==1) {
		 System.out.println("Resut is existing for amazon");
	 }else {
		 System.out.println("Result is not displaying");
	 }
	 SoftAssert sg=new SoftAssert();
	 sg.assertEquals(1, elements);
	 sg.assertAll();
	 results.ComputerToClick();
  }
}
