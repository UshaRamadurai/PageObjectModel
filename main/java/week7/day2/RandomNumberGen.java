package week7.day2;

import org.testng.annotations.Test;

public class RandomNumberGen {
	
	@Test(retryAnalyzer = RetryFailed.class, timeOut=300)
	public void numberGeneration() throws InterruptedException {
		int n= (int) (Math.random()*1000);
		System.out.println(n);
		Thread.sleep(n);
	}

}
