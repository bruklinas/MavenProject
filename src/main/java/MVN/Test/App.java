package MVN.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	@Test()
	public static void main() {
		System.out.println("Hello World!");
		System.out.println("Updated .");
		System.out.println("Third line.");
		System.out.println("Line for Jenkins.");
		
		Assert.assertTrue(false);
	}
}
