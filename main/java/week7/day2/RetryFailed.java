package week7.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
	int count = 0;

	public boolean retry(ITestResult result) {

		if (!result.isSuccess() && count < 3) {
			count++;
			return true;
		}
		return false;
	}
}