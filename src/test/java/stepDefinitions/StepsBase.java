package stepDefinitions;

import java.io.IOException;
import commonMethods.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StepsBase extends CommonMethods {
	
	@Before()
	public void setup() throws IOException {

		setDriver();
	}

	@After()
	public void tearDown() {

		closeDriver();
	}

}
