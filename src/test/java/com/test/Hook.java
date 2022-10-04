package com.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BascClass {

@Before
	public static void tc1() {
		Browerlunach();
		windowsmax();
		lunachurl("https://www.shopbop.com/ap/signin?clientContext=131-9483639-6258020&openid.pape.max_auth_age=1800&openid.return_to=https%3A%2F%2Fm.shopbop.com%3A443%2Fauth%2Fafter%2Fauthportal&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=shopbop_us_aui&openid.mode=checkid_setup&siteState=gyFdoMm%2F3ZTKZhe7rKK%2FKLbhZhfSbGqSeM2RTLtao%2FXSAAAAAQAAAABjNa%2FWcmF3AAAAAD1aGrfyIF6IE%2BJ7i%2Fa6ow%3D%3D%7Chttps%3A%2F%2Fm.shopbop.com%3A443%2F&marketPlaceId=A2817T8MKXE20N&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=shopbop-mobile-site&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}

	@After
	public static void tc2() throws InterruptedException {
Thread.sleep(3000);
		System.out.println("verifed");
	driver.close();
	}

}
