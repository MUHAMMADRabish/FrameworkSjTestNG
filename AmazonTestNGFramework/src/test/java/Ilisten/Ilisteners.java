package Ilisten;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Coomon.Commons;

public class Ilisteners extends Commons  implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Commons)result.getInstance()).driver;
		try {
			Screenshot("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Commons)result.getInstance()).driver;
		try {
			Screenshot("Failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
