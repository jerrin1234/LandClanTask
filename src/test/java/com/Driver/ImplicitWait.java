package com.Driver;

import com.CucumberRunner.BaseClass;
import java.util.concurrent.TimeUnit;
public class ImplicitWait extends BaseClass {
	public void implicit() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

}
