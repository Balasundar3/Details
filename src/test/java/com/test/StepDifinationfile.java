package com.test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDifinationfile extends BascClass {

@When("user to find validate username and invalidate passward")
public void userToFindValidateUsernameAndInvalidatePassward() {
   PojoClass l= new PojoClass();
   passTXt(l.getShop(), "bala");
   passTXt(l.getShoppass(), "2542654");
   getAttribut(l.getShoppass());
	
}

@When("To click Login button")
public void toClickLoginButton() {
   PojoClass l=new PojoClass();
   click(l.getLogshop());
   
   
   
}

@Then("goto error page")
public void gotoErrorPage() {
  System.out.println("its verifed application");  
}


}
